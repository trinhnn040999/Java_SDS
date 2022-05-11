package ex.sds.employee;

// All receptionists have different names
// Receptionists are always female
// Receptionists are never contracted
// Each receptionist can have different salary from each other

public class Receptionist implements Employee {
    public String name;
    public String po;
    public String sex;
    public double Luong;
    public boolean contract;
    public String toString() {
        return (name + " " + po+ " "+ sex + " " + Luong + " " + contract);
    }

    

    public Receptionist(String name, String po, String sex, double luong, boolean contract) {
        this.name = name;
        this.po = po;
        this.sex = sex;
        Luong = luong;
        this.contract = contract;
    }

    @Override
    public void work() {
        System.out.println("Doing reception works");
    }

    @Override
    public boolean isFemale() {
        return true;
    }

    @Override
    public boolean isConstracted() {
    
        return false;
    }

    @Override
    public double salary() {
        
        return Luong;
    }
    
    
}
