package ex.sds;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Tao cua hang
        Store store = new Store(3000);
        System.out.println("Tong tai san (ban dau): " + store.totalMoney());
        for (int i = 0; i < 10; i++) {
            Item book = new Book("SGK 12 " + i);
            store.add(book);
        }
        System.out.println( "10 books added " );
        int i = 0;
        while (true) {
            Item pen = new Pen("Pen " + i);
            i++;
            if (!store.add(pen)) {
                break;
            }
        }
        System.out.println("" + (i-1) + "pens added");
        System.out.println("Tong tai san (sau khi nhap hang): " + store.totalMoney());
        store.listItems();

        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            if (random.nextDouble() > 0.5) {
                int n = random.nextInt(i);
                if (store.sell("Pen")) {
                    System.out.println("Successfully sell pen " + n + " to customer " + j);
                } 
                else {
                    System.out.println("Failed to sell pen " + n + " to customer " + j);
                }
            }
            else {
                int n = random.nextInt(10);
                if (store.sell("Book")) {
                    System.out.println("Successfully sell Book " + n + " to customer " + j);
                } 
                else {
                    System.out.println("Failed to sell Book " + n + " to customer " + j);
                }
            }
        }

        System.out.println("Tong tai san (sau khi ban hang): " + store.totalMoney());
        store.listItems();
    }
}
