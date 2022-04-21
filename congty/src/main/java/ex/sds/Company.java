package ex.sds;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private double monthlyBudget;
    private List<Employee> employees = new ArrayList<Employee>();
    
    public Company(String name, double monthlyBudget) {
        this.name = name;
        this.monthlyBudget = monthlyBudget;
    }
    public double getMonthlyBudget() {
        return monthlyBudget;
    }
    public void setMonthlyBudget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double tongLuong(){      //tinh tong luong
        double sum=0;
        for(Employee e: employees){
            sum +=e.getSalary();
        }
        return sum;
    }

    public boolean addEmployee(Employee e){     //them nhan vien
        if(monthlyBudget - tongLuong() >=e.getSalary()){
            employees.add(e);
            return true;
        }
        return false;
    }

    public boolean removeEmployee(String name){     //xoa nhan vien
        for(Employee e: employees){
            if(e.getName().equals(name)){
                employees.remove(e);
                return true;
            } 
        }
        return false;
    }
    public Employee getEmployee(String name){       //lay nhan vien theo ten
        for(Employee e: employees){
            if(e.getName().equals(name)){
                return e;
            } 
        }
        return null;
    }
    public void printEmployees() {
        System.out.println("=============");
        for (Employee e : employees) {
            e.showInfo();
        }
        System.out.println();
    }

    public void log() throws IOException{
        PrintWriter writer = new PrintWriter("log.dat");
        for(Employee e: employees){
            writer.printf("%s - Salary: %.0f\n", e.getName(), e.getSalary());
        }
        writer.close();
    }
}
