package ex.sds;

import java.sql.Savepoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        Company c = new Company("employee.txt");
        c.addEmployee(new Employee(1, "Bill Gates", "CEO"));
        c.addEmployee(new Employee(2, "Steve", "Sale"));
        c.addEmployee(new Employee(3, "David Beckham", "PR"));
        c.saveToFile();
       // c.loadFromFile();
        c.displayCompanyInfo();
        System.out.println("Does this company have employee with id = 1? " + (c.hasEmployee(1)?"yes":"no"));
        System.out.println("Employee with id = 1: " + c.getEmployee(1).toString());
    }
}
