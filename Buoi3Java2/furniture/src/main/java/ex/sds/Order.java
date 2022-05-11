package ex.sds;

public class Order {
    private Furniture soldItem;

    public void setSoldItem(Furniture item) {
        this.soldItem = item;
    }

    public Furniture getSoldItem() {
        return this.soldItem;
    }
    public Order(Furniture soldItem) {
        this.setSoldItem(soldItem) ;
    }
}
