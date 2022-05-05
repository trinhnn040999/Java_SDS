package ex.sds;

abstract public class Item {
    private String name;
    
    public Item(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract double getPrice();
    
    public abstract double getValue();
    
    public String getType() {
        return this.getClass().getSimpleName();
    }
    
    abstract public void displayInfo();
}
