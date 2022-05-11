package ex.sds;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FurnitureShop {
    private int capacity;
    private List<Furniture> items;
    private Random rd = new Random();
    private List<Order> orders;

    public int getCapacity() {
        return capacity;
    }
    public List<Furniture> getItems() {
        return items;
    }

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

    public void sell(String fu) throws StockEmptyException {
        if (fu.equals("Chair")){
            List<Furniture> chairs = getAvailableChairs();
            if(chairs != null){
                int sellChair = rd.nextInt(chairs.size());
                Furniture chair = chairs.get(sellChair);
                System.out.println("Size Chair: "+chairs.size()+ " ghe ban: "+sellChair);
                items.remove(chair);
                Order order = new Order(chair);
                orders.add(order);
                System.out.println("So ghe: "+getAvailableChairs().size()+" So luong sp ban: "+orders.size());
            }
            else throw new StockEmptyException();
        }
        else {
            List<Furniture> tables = getAvailableChairs();
            if(tables != null){
                int sellTable = rd.nextInt(tables.size());
                Furniture table = tables.get(sellTable);
                System.out.println("Size Table: "+tables.size()+ " Table ban: "+sellTable);
                items.remove(table);
                Order order = new Order(table);
                orders.add(order);
                System.out.println("So ban: "+getAvailableTables().size()+" So luong sp ban: "+orders.size());
            }
            else throw new StockEmptyException();
        }
    }

    public List<Furniture> getAvailableChairs() {
        List<Furniture> listChair = new ArrayList<Furniture>();
        for (Furniture f : items) {
            if (f.getClass().getSimpleName().equals("Chair"))
                listChair.add(f);
        }
        return listChair;
    }

    public List<Furniture> getAvailableTables() {
        List<Furniture> listTable = new ArrayList<Furniture>();
        for (Furniture f : items) {
            if (f.getClass().getSimpleName().equals("Table"))
                listTable.add(f);
        }
        return listTable;
    }

    public double revenue() {
        double res = 0;
        for (Order order : orders) {
            res += order.getSoldItem().getPrice();
        }
        return res;
    }
}
