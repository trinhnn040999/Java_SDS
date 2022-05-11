-- Cau 9:
select count(INV_NUMBER) as SOLUONGHOADON
from invoice;

-- Cau 10:
select count(*)
from customer 
where CUS_BALANCE >500;

-- Cau 11:
select c.CUS_CODE, i.INV_NUMBER, INV_DATE, P_DESCRIPT, LINE_UNIT, LINE_PRICE
from customer as c inner join invoice as i on c.CUS_CODE = i.CUS_CODE
				inner join line as l on l.INV_NUMBER = i.INV_NUMBER
                inner join product as p on l.P_CODE=p.P_CODE
order by CUS_CODE, INV_NUMBER, P_DESCRIPT;

-- Cau 12:

select c.CUS_CODE, i.INV_NUMBER, P_DESCRIPT, LINE_UNIT as 'Units Bought' , LINE_PRICE as 'Unit Price', 
LINE_UNIT*LINE_PRICE as Subtotal
from customer as c inner join invoice as i on c.CUS_CODE = i.CUS_CODE
				inner join line as l on l.INV_NUMBER = i.INV_NUMBER
                inner join product as p on l.P_CODE=p.P_CODE
order by CUS_CODE, INV_NUMBER, P_DESCRIPT;

-- Cau 13:
select c.CUS_CODE, CUS_BALANCE, sum(LINE_UNIT*LINE_PRICE) as 'Total Purchases'
from customer as c inner join invoice as i on c.CUS_CODE = i.CUS_CODE
				inner join line as l on l.INV_NUMBER = i.INV_NUMBER
                inner join product as p on l.P_CODE=p.P_CODE
group by c.CUS_CODE, CUS_BALANCE
order by CUS_CODE;

-- Cau 14:
select c.CUS_CODE, CUS_BALANCE, sum(LINE_UNIT*LINE_PRICE) as 'Total Purchases', count(LINE_NUMBER) as 'Number of Purcharses'
from customer as c inner join invoice as i on c.CUS_CODE = i.CUS_CODE
				inner join line as l on l.INV_NUMBER = i.INV_NUMBER
                inner join product as p on l.P_CODE=p.P_CODE
group by c.CUS_CODE, CUS_BALANCE
order by CUS_CODE;

-- Cau 15:
select c.CUS_CODE, CUS_BALANCE, sum(LINE_UNIT*LINE_PRICE) as 'Total Purchases', count(LINE_NUMBER) as 'Number of Purcharses',
avg(LINE_UNIT*LINE_PRICE) as 'Average Purchase Amount'
from customer as c inner join invoice as i on c.CUS_CODE = i.CUS_CODE
				inner join line as l on l.INV_NUMBER = i.INV_NUMBER
                inner join product as p on l.P_CODE=p.P_CODE
group by c.CUS_CODE, CUS_BALANCE
order by CUS_CODE;
-- Cau 16:
select i.INV_NUMBER, avg(LINE_PRICE) as 'Total Invoice'
from customer as c inner join invoice as i on c.CUS_CODE = i.CUS_CODE
				inner join line as l on l.INV_NUMBER = i.INV_NUMBER
                inner join product as p on l.P_CODE=p.P_CODE
group by i.INV_NUMBER;
-- Cau 17:
select c.CUS_CODE, i.INV_NUMBER, avg(LINE_PRICE) as 'Total Invoice'
from customer as c inner join invoice as i on c.CUS_CODE = i.CUS_CODE
				inner join line as l on l.INV_NUMBER = i.INV_NUMBER
                inner join product as p on l.P_CODE=p.P_CODE
group by i.INV_NUMBER, c.CUS_CODE;
