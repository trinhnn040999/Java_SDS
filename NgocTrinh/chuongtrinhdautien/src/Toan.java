public class Toan {
    private int count = 0;
    public void increase(){
        count = count +1;
    }
    public int getCount(){
        return count;
    }
    public void show(){
        System.out.println("Gia tri la: " + count);
    }
}
