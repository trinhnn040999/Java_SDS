package ex.sds;

public class Pen extends Item {
    public Pen(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println(String.format("Pen: %s - %f - %f", getName(), getValue(), getPrice()));                
    }

    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public double getValue() {
        return 50;
    }
}
