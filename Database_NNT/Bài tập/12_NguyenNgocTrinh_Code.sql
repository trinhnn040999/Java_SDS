-- PHẦN 1: THIẾT KẾ CƠ SỞ DỮ LIỆU
create database _12_NGUYENNGOTRINH;
use _12_NGUYENNGOTRINH;
create table KHACHHANG(
SOCANCUOC INT primary KEY, 
HOTEN varchar(50), 
DIACHI varchar(50) , 
SODIENTHOAI varchar(50));

create table TAIKHOAN(
SOTAIKHOAN INT primary KEY);

create table SOHUU(
SOCANCUOC INT, 
SOTAIKHOAN INT,
primary key (SOCANCUOC, SOTAIKHOAN),
foreign key(SOCANCUOC) references KHACHHANG(SOCANCUOC),
foreign key(SOTAIKHOAN) references TAIKHOAN(SOTAIKHOAN)
);

create table TAIKHOANTIETKIEM(
SOTAIKHOAN INT primary KEY, 
SODUTK FLOAT, 
LAISUAT FLOAT, 
NGAYMO DATE,
foreign key(SOTAIKHOAN) references TAIKHOAN(SOTAIKHOAN));
create table TAIKHOANKHONGTRALAI(
SOTAIKHOAN INT primary KEY, 
SODUTK FLOAT, 
NGAYMO DATE,
foreign key(SOTAIKHOAN) references TAIKHOAN(SOTAIKHOAN));

create table NHANVIEN(
MANHANVIEN INT primary KEY, 
HOTEN varchar(50),
SODIENTHOAI varchar(50));

create table TKCHOVAY(
SOTAIKHOAN INT primary KEY, 
SOTIENVAY FLOAT, 
NGAYMOKHOANVAY DATE, 
TYLELAISUAT FLOAT, 
MANHANVIEN INT,
foreign key(SOTAIKHOAN) references TAIKHOAN(SOTAIKHOAN),
foreign key(MANHANVIEN) references NHANVIEN(MANHANVIEN));





create table DOANVIEN(
MaDoanVien int primary key,
HoTen varchar(30), NgaySinh date,
QueQuan varchar(50), 
MaTinh int, MaDanToc int, MaTonGiao int,
foreign key(MaTinh) references TINH(MaTinh),
foreign key(MaDanToc) references DANTOC(MaDanToc),
foreign key(MaTonGiao) references TONGIAO(MaTonGiao)
);

/* PHẦN 2: TRUY VẤN SQL */
-- Viết các câu lệnh phía dưới các câu hỏi

/*Câu 1: Cho biết tên (title) những quyển sách có giá (price) từ 1000 đến 2000*/
select title
from titles
where price >= 1000 and price <= 2000;

/*Câu 2: Cho biết mã quyển sách (title_id) và tên quyển sách (title), giá (price), ngày xuất bản(pubdate) của những nhà xuất bản tại Mỹ (USA) */
select title_id, title, price, pubdate
from titles t inner join publishers p on t.pub_id = p.pub_id
where country = 'USA';

/*Câu 3: Cho biết thông tin: mã tác giả (au_id), Tên cuối (au_lname), Tên đầu (au_fname), số ĐT(phone), địa chỉ(address) và số lượng sách theo từng tác giả mà có số lượng đầu sách nhiều hơn 1*/
select a.au_id, au_lname, au_fname, phone, address, count(t.title_id) as SoLuongSach
from titles t inner join titleauthor ta on t.title_id = ta.title_id
				inner join authors a on ta.au_id = a.au_id
group by au_id, au_lname, au_fname, phone, address
having count(t.title_id) >1;
                

/*Câu 4: Cho biết thông tin và tổng tiền (price*qty) theo từng quyển sách*/
select t.title_id, title, t.type, pub_id, price, advance, royalty, ytd_sales, notes, pubdate, price*qty as TongTien
from titles t inner join sales s on t.title_id = s.title_id;

/*Câu 5: Cho biết thông tin kho (stores) chưa bán quyển sách nào trong năm 1992*/
select *
from stores 
where stor_id not in (select stor_id from sales
					where year(ord_date) =1992);
/*Câu 6: Cho biết danh sách nhà xuất bản có tổng tiền trung bình (qty*price) cao hơn tổng tiền trung bình của tất cả các nhà xuất bản*/
select p.pub_id, pub_name, city, state, country
from titles t inner join publishers p on t.pub_id = p.pub_id
			inner join sales s on t.title_id = s.title_id 
group by p.pub_id, pub_name, city, state, country
having avg(price*qty) > (select avg(price*qty)
						from titles t inner join sales s on t.title_id = s.title_id)

/*Câu 7: Cho biết tên quyển sách giá bán từ 20 USD trở lên được bán trong năm 1992*/
select title
from titles 
where title_id in
(select title_id from sales where year(ord_date) =1992) and price>20;
/*Câu 8: Cho biết tên quyển sách (title) có tổng số lượng bán (qty) nhiều hơn quyển sách có mã là 'PC8888' */
select title 
from titles 
where title_id in (select title_id from sales where qty >	(select qty
															from sales where title_id = 'PC8888'));
/*Câu 9: Cho danh sách các kho (store) có 1 số đầu mã bưu chính (zip) là 9  và 8*/
select *
from stores where zip like '98%';

/*Câu 10: Cho biết thông tin chi tiết về tác giả ở thành phố (city) 'Oakland' và tên quyển sách của tác giả xuất bản năm 1992*/
select * from authors where au_id in (select a.au_id
										from titles t inner join titleauthor ta on t.title_id = ta.title_id
										inner join authors a on ta.au_id = a.au_id
                                        where year(pubdate) = 1992) 
						and city = 'Oakland';
                        