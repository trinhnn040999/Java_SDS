package ex.sds;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Component> components = null;
    private String model;
    private String serialNumber;

    public Computer(String model, String serialNumber) {
        this.components = new ArrayList<Component>();
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public List<Component> getComponents() {
        return components;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setComponents(List<Component> components) {
        this.components = components;
    }


    public void show(){
        System.out.println("The configuration of computer:");
        System.out.println(" Model: " + this.model);
        System.out.println(" Serial number: " + this.serialNumber);
        System.out.println(" Components: ");
        for(Component comp: this.components){
            System.out.println("    " + comp.getType() + " - " + comp.getSerialNumber() + " - " + comp.getPrice());
        }
        System.out.println();
    }
    public double calcPrice(){
        double price = 0;
        for(Component comp: this.components){
            price += comp.getPrice();
        }
        return price; 
    }
    public void addComponent(Component c){
        this.components.add(c);
    }
}
