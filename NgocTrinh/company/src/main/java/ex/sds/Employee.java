package ex.sds;

public class Employee {
    private String name;
    private double salary;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println(String.format("Nhan vien %s -Luong: %s", name, salary));
    }
    
}
