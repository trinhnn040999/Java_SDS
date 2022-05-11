package ex.sds;

public class Table implements Furniture {

    private String serialNumber;
    private double price;
    private double decayFactor;
    private boolean sold;

    public Table(String serialNum, double initValue, double decayFactor) {
        this.serialNumber = serialNum;
        this.price = initValue;
        this.decayFactor = decayFactor;
        this.sold = false;
    }

    public double getPrice() {
        return price;
    }

    public void show() {
        System.out.println("Table - S/N: " + serialNumber + ", price: " + price);
        price = price * (1.0 - decayFactor);
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
