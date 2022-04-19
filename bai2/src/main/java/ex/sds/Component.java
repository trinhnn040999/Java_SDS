package ex.sds;

public class Component {
    private String type;
    private String serialNumber;
    private double price;
    public Component(String type, String serialNumber, double price) {
        this.setType(type);
        this.setSerialNumber(serialNumber);
        this.setPrice(price);
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
