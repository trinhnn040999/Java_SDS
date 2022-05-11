package ex.sds.employee;

// All securities have different names
// Securities are alway male
// Securities are never contracted
// All securities have the same salary, 400 ($)
public class Security implements Employee {
    // TODO:
    public String name;
    public String po;
    public String sex;
    public double Luong;
    public boolean contract;
    public String toString() {
        return (name + " " + po+ " "+ sex + " " + Luong + " " + contract);
    }
    

 

    public Security(String name, String po, String sex, double luong, boolean contract) {
        this.name = name;
        this.po = po;
        this.sex = sex;
        Luong = luong;
        this.contract = contract;
    }

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.println("Doing securities works");
    }

    @Override
    public boolean isFemale() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isConstracted() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public double salary() {
        // TODO Auto-generated method stub
        return 400;
    }
    
}
