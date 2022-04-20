package ex.sds;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    public Computer() {
        this.components = new ArrayList<Component>();
    }

    private List<Component> components;

    
    public double calcPrice(){          //tinh gia tien
        double price = 0;
        for(Component comp: components){
            price += comp.getPrice();
        }
        return price; 
    }

    public void addComponent(Component c){      //them Componnent
        this.components.add(c);
    }

    public Component getComponent(String serialNumber){         //lay Component
        for(Component c: components){
            if(c.getSerialNumber()==serialNumber){
                return c;
            }
        }
        return null;
    }

    public boolean removeComponent(String serialNumber){        //xoa Component
        for(Component c: components){
            if(c.getSerialNumber()==serialNumber){
                components.remove(c);
                return true;
            }
        }
        return false;
    }
    public void showConfig(){       //xem cau hinh
        System.out.println("SHow config:");
        for(Component c: components){
            c.showSpecification();
            System.out.println("...........");
        }
    }
}
