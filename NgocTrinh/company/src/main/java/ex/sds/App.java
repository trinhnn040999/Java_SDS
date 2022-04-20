package ex.sds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee nhanvien1 = new Employee();
        nhanvien1.setName("Nguyen Ngoc Trinh");
        nhanvien1.setSalary(10000);

        Employee nhanvien2 = new Employee();
        nhanvien2.setName("Luong Van Minh");
        nhanvien2.setSalary(50000);

        Employee nhanvien3 = new Employee();
        nhanvien3.setName("Luong Tuan Anh");
        nhanvien3.setSalary(50000);

        Employee nhanvien4 = new Employee();
        nhanvien4.setName("Nguyen Hong Phuc");
        nhanvien4.setSalary(30000);

        Company congty = new Company();
        congty.setName("Cong ty co phan Trinh Minh");
        congty.setMonthlyBudget(100000);

        congty.addEmployee(nhanvien1);
        congty.addEmployee(nhanvien2);
        congty.addEmployee(nhanvien3);
        congty.addEmployee(nhanvien4);
        congty.removeEmployee(nhanvien4);

        /*String ten = "Luong Van Minh";
        Employee x = congty.getEmployee(ten);
        System.out.println("Nhan vien co ten Luong Van Minh la: ");
        x.showInfo();
        */
        congty.printEmployees();


    }
}
