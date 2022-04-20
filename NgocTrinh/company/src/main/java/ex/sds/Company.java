package ex.sds;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees = new ArrayList<Employee>();
    private double monthlyBudget;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }
    public void setMonthlyBudget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public double tongLuong(){          //tinh tong luong
        double tong = 0;
        for(Employee em: employees){
            tong += em.getSalary();
        }
        return tong; 
    }

    public boolean addEmployee(Employee e){     //them nhan vien
        double tong = this.tongLuong();
        if(monthlyBudget - tong >= e.getSalary()){
            employees.add(e);
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee e){              //xoa nhan vien
                employees.remove(e);
                return true;
    }

    public Employee getEmployee(String name){           //lay nhan vien
        for(Employee em: employees){
            if(em.getName()==name){  
                return em;
            }
        }
        return null;
    }

    public void printEmployees(){
        System.out.println("Nhan vien cua cong ty la:");
        for(Employee em: employees){
            em.showInfo();
            System.out.println("...........");
        }
    }
}
