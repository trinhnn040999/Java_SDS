package ex.sds;

public class Task {
    private String name;
    private double value;
    public Task(String name, double value) {
        this.name = name;
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return (getName() + ":" + getValue());
    }
    
    
}
