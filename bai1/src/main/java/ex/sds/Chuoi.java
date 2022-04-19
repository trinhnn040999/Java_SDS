package ex.sds;

public class Chuoi {
    private String chuoi;

    public Chuoi(String chuoi) {
        this.chuoi = chuoi;
    }
    public String viethoa(){
        return chuoi = chuoi.toUpperCase();
    }
    public void showChuoi(){
        System.out.println("Chuoi viet hoa la: "+chuoi);
    }
}
