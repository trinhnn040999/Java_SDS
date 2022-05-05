package ex.sds;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private List<Item> inventory;
    private double cash;
    public Store(double cash) {
        inventory = new ArrayList<Item>();
        this.cash = cash;
    }
    
    public Store() {
        this(1000);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean add(Item item) {
        if (item.getValue() > cash) return false;
        inventory.add(item);
        cash -= item.getValue();
        return true;
    }
    public boolean sell(String itemType) {
        for (Item i : inventory) {
            if (i.getType().equals(itemType)) {
                inventory.remove(i);
                cash += i.getPrice();
                return true;
            }
        }
        return false;
    }
    public void listItems() {
        System.out.println("==========");
        for (Item i : inventory) {
            i.displayInfo();
        }
        System.out.println();
    }
    private double totalInventoryValue() {
        double v = 0;
        for (Item i: inventory) {
            v += i.getValue();
        }
        return v;
    }
    public double totalMoney() {
        return totalInventoryValue() + cash;
    }
}