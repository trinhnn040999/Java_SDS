package ex.sds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
    private List<Employee> employees;
    private String fileName;

    public Company(String fileName) {
        employees = new ArrayList<Employee>();
        this.fileName = fileName;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public boolean hasEmployee(int id) {
        return employees.contains(new Employee(id));
    }

    public Employee getEmployee(int id) {
        int index = employees.indexOf(new Employee(id));
        if (index < 0)
            return null;
        return employees.get(index);
    }

    public void loadFromFile() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        while (line != null) {
            String[] tokens = line.split("\t");
            // System.out.println("id" + tokens[0]);
            // System.out.println("name" + tokens[1]);
            // System.out.println("position" + tokens[2]);
            Employee e = new Employee(Integer.valueOf(tokens[0]), tokens[1], tokens[2]);
            addEmployee(e);
            line = reader.readLine();
        }
        reader.close();

    }

    public void saveToFile() throws Exception {
        PrintWriter writer = new PrintWriter(new File(fileName));
        for (Employee e : employees) {
            writer.println(e.toString());
        }
        writer.close();

    }

    public void displayCompanyInfo() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
