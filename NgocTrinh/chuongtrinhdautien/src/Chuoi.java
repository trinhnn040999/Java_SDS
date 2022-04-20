public class Chuoi {
    private String chuoi;
    public Chuoi(String ch){
        chuoi = ch;
    }
    public void viethoa(){
        chuoi = chuoi.toUpperCase();
    }
    public void show(){
        System.out.println("Chuoi la: "+chuoi);
    }
}
