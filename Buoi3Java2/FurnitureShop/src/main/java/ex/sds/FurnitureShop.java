package ex.sds;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private int capacity;
    private List<Furniture> items;
    private List<Order> orders;

    public FurnitureShop(int capa) {
        this.capacity = capa;
        items = new ArrayList<Furniture>();
        orders = new ArrayList<Order>();
    }

    public void stock(Furniture furniture) throws NoMoreSpaceException {
        if (items.size() < capacity) {
            items.add(furniture);
        } else {
            throw new NoMoreSpaceException();
        }
    }

    public void sell(String furnitureType) throws StockEmptyException {
        // if(g)
    }

    public List<Furniture> getAvailableChairs() {
        return null;
    }

    public List<Furniture> getAvailableTables() {
        return null;
    }

    public double revenue() {
        double res = 0;
        for (Order order : orders) {
            res += order.getSoldItem().getPrice();
        }
        return res;
    }
}
