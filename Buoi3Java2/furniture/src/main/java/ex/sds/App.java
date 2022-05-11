package ex.sds;

import java.util.Random;

public class App {
    public static void main(String[] args) throws StockEmptyException, NoMoreSpaceException {

        FurnitureShop shop = new FurnitureShop(30);
        int slg = shop.getCapacity();

        Random rd = new Random();
        FurnitureFactory factory = new FurnitureFactory();
        int chairs = 0;
        int tables = 0;
        for (int i = 0; i < slg; i++) {
            int j = rd.nextInt(2);
            if (j == 0) {
                Chair chair = factory.createChair("Chair " + chairs, 450, 0.005);
                shop.stock(chair);
                if(chairs % 2 ==0) chair.show();
                chairs++;
            } else {
                Table table = factory.createTable("Table " + tables, 550, 0.004);
                shop.stock(table);
                if(tables % 2 ==0) table.show();
                tables++;
            }
        }
        int sell = rd.nextInt(2);
        System.out.println("ban sell " + sell);
        shop.sell("Chair");
       System.out.println("Doanh thu: "+shop.revenue());
    }
}
