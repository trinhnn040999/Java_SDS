package ex.sds;

public class Table implements Furniture {
    private String serialNum;
    private double price;
    private double decayFactor;
    private boolean sold;


    

    public Table(String serialNum, double initValue, double decayFactor) {
        this.serialNum = serialNum;
        this.price = initValue;
        this.decayFactor = decayFactor;
        this.sold = false;
    }

    @Override
    public double getPrice() {
       return price;
    }

    @Override
    public void show() {
        System.out.println("Table - serial number: " + serialNum + ", price: " + price);
        price = price * (1.0 - decayFactor);
        
    }

    @Override
    public boolean isSold() {
       return sold;
    }
    public void setSold(boolean sold) {
        this.sold = sold;
    }
    
}
