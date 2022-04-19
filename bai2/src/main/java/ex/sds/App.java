package ex.sds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Computer com = new Computer("DELL", "HDBNAMIRW1356Q");

        Component monitor = new Component("monitor", "M-1" , 100);
        Component cpu = new Component("cpu", "C-1" , 100);
        Component mouse = new Component("mouse", "m-1" , 150);
        Component keyboard = new Component("keyboard", "K-1" , 100);

        com.addComponent(monitor);
        com.addComponent(cpu);
        com.addComponent(mouse);
        com.addComponent(keyboard);

        com.show();
        double price = com.calcPrice();
        System.out.println("Gia = "+price);

    }
}
