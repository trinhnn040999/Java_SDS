package ex.sds.employee;
// All sales have names
// Sales can be either male or female
// Each sale can have difference salary
// Sales can be either contracted or not contracted
public class Sales implements Employee{
    // TODO:
    public String name;
    public String po;
    public String sex;
    public double Luong;
    public boolean contract;
    public String toString() {
        return (name + " " + po+ " "+ sex + " " + Luong + " " + contract);
    }
    


    public Sales(String name, String po, String sex, double luong, boolean contract) {
        this.name = name;
        this.po = po;
        this.sex = sex;
        Luong = luong;
        this.contract = contract;
    }

    @Override
    public void work() {
        // TODO:
        System.out.println("Doing salary works");
        
    }

    @Override
    public boolean isFemale() {
        if(sex.equals("female")) return true;
        return false;
    }

    @Override
    public boolean isConstracted() {
        return contract;
    }

    @Override
    public double salary() {
        // TODO:
        return Luong;
    }
    
}
