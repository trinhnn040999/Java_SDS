package ex.sds;

public class Book extends Item {

    public Book(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println(String.format("BOOK: %s - %f - %f", getName(), getValue(), getPrice()));
    }

    @Override
    public double getPrice() {
        return 250;
    }

    @Override
    public double getValue() {
        return 200;
    }
    
}
