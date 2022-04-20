package ex.sds;

public class Component {

    private String serialNumber;        //khai bao bien
    private double price;

    public void setSerialNumber(String ser){        //gan Serialnumber
        serialNumber = ser;
    }

    public String getSerialNumber(){        //lay SerialNumber
        return serialNumber;
    }
    
    public void setPrice(double price){     //gan Price
        this.price = price;
    }

    public double getPrice(){       //lay gia
        return price;
    }

    public void showSpecification(){        // dac ta
        System.out.println(String.format("SerialNumber is %s -Price %s", serialNumber, price));
    }
}
