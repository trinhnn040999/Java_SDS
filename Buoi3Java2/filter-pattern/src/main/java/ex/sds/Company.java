package ex.sds;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ex.sds.employee.Employee;
import ex.sds.employee.Receptionist;
import ex.sds.employee.Sales;
import ex.sds.employee.Security;
import ex.sds.filters.MaleCriterion;


public class Company {
    private List<Employee> employees;
    public Company() {
        employees = new ArrayList<Employee>();
    }
    public void loadFromFile(String fileName) throws Exception {
        // TODO: load content of fileName into employees
        BufferedReader reader = new BufferedReader(new FileReader(fileName));  //Jonhny Security male 1000 false
        String line = reader.readLine();
        while (line != null) {
            String[] tokens = line.split(" ");
            if(tokens[1].equals("Sales")){
                Sales s = new Sales(tokens[0], tokens[1], tokens[2], Double.valueOf(tokens[3]), Boolean.valueOf(tokens[4]));
                employees.add(s);
            }
            else if(tokens[1].equals("Receptionist")){
                Receptionist r = new Receptionist(tokens[0], tokens[1], tokens[2], Double.valueOf(tokens[3]), Boolean.valueOf(tokens[4]));
                employees.add(r);
            }
            else if(tokens[1].equals("Security")){
                Security se = new Security(tokens[0], tokens[1], tokens[2], Double.valueOf(tokens[3]), Boolean.valueOf(tokens[4]));
                employees.add(se);
            }
            line = reader.readLine();
        }
        reader.close();
    }
    public void displayEmployees() {
        System.out.println("Tat ca cac nhan vien:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
    public void displayMaleEmployees() {
        System.out.println("Cac nhan vien co gioi tinh = nam la:");
        MaleCriterion m = new MaleCriterion();
        for (Employee e : m.match(employees)) {
            System.out.println(e);
        }
        
    }
    public List<Employee> getMaleEmployees() {
        // TODO: return only male employees (Use maleCriterion).
        MaleCriterion m = new MaleCriterion();
        return m.match(employees);
    }
    public List<Employee> getEmployees(){
        return employees;
    }
}
