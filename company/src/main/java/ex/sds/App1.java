package ex.sds;

public class App1 {
    public static void main(String args[]) throws Exception{
        Company c = new Company("employee.txt");
        c.loadFromFile();
        c.displayCompanyInfo();
    }
}
