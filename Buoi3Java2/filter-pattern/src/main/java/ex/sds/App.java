package ex.sds;

import java.util.List;

import ex.sds.employee.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Company company = new Company();
        company.loadFromFile("employees.txt");
        company.displayEmployees();
        company.displayMaleEmployees();
        List<Employee> maleOnly = company.getMaleEmployees();
        for (Employee e: maleOnly) {
            e.work();
        }
    }
}
