package ex.sds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Component monitor1 = new Component();       //tao 2 doi tuong monitor
        Component monitor2 = new Component();
        monitor1.setSerialNumber("M1_123");
        monitor2.setSerialNumber("M2_123");
        monitor1.setPrice(1000);
        monitor2.setPrice(2000);

        Component cpu1 = new Component();       //tao 2 doi tuong cpu
        Component cpu2 = new Component();
        cpu1.setSerialNumber("C1_123");
        cpu2.setSerialNumber("C2_123");
        cpu1.setPrice(1500);
        cpu2.setPrice(2500);

        Component mouse1 = new Component();       //tao 2 doi tuong mouse
        Component mouse2 = new Component();
        mouse1.setSerialNumber("m1_123");
        mouse2.setSerialNumber("m2_123");
        mouse1.setPrice(7000);
        mouse2.setPrice(5000);

        Component keyboard1 = new Component();       //tao 2 doi tuong keyboard
        Component keyboard2 = new Component();
        keyboard1.setSerialNumber("K1_123");
        keyboard2.setSerialNumber("K2_123");
        keyboard1.setPrice(1500);
        keyboard2.setPrice(4000);

        Computer com1 = new Computer();      //Tao doi tuong com1 cua Computer
        Computer com2 = new Computer();        //Tao doi tuong com2 cua Computer
        com1.addComponent(monitor1);     //Them cac component vao com1, com2
        com2.addComponent(monitor2);
        com1.addComponent(cpu1);
        com2.addComponent(cpu2);
        com1.addComponent(mouse1);
        com2.addComponent(mouse2);
        com1.addComponent(keyboard1);
        com2.addComponent(keyboard2);

        com1.showConfig();       // xem cau hinh cua com1
        double price1;
        price1= com1.calcPrice();        //tinh gia tien cua com1
        System.out.println("Gia cua may tinh com la: " +price1);

        com2.showConfig();      //xem cau hinh cua com2
        double price2;
        price2= com2.calcPrice();        //tinh gia tien cua com2
        System.out.println("Gia cua may tinh com la: " +price2);
    }
}
