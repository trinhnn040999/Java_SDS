package ex.sds;

public class Chair implements Furniture {

    private String serialNumber;
    private double price;
    private double decayConstant;
    private boolean sold;

    public Chair(String serialNum, double initValue, double decayConstant) {
        this.serialNumber = serialNum;
        this.price = initValue;
        this.decayConstant = decayConstant;
        this.sold = false;
    }

    public double getPrice() {
        return price;
    }

    public void show() {
        System.out.println("Chair - S/N: " + serialNumber + ", price: " + price);
        if (price > decayConstant) {
            price -= decayConstant;
        }
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
