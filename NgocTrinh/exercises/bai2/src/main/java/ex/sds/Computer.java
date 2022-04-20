package ex.sds;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Component> components = new ArrayList<Component>();
    private String model;
    private String serialNumber;

    public void show(){
        return;
    }

    public double calcPrice(){
        return 1.1*
    }

    public void addComponent(Component c){
        return;
    }

    public Computer(List<Component> components, String model, String serialNumber){
        this.components = components;
        this.model = model;
        this.serialNumber = serialNumber;
    }
    public String getModel(){
        return model;
    } 
    public void setModel(String model){
        this.model=model;
    }
}
