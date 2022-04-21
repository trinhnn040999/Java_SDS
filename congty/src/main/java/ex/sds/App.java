package ex.sds;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Employee giamdoc = new Employee("Luong Van Minh", 10000);
        Employee chutich = new Employee("Nguyen Ngoc Trinh", 20000);

        Company congty = new Company("Cong ty TNHH Trinh Minh", 50000);

        congty.addEmployee(giamdoc);
        congty.addEmployee(chutich);

        congty.printEmployees();
        congty.log();
    }
}
