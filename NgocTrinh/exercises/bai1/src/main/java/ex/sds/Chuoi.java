package ex.sds;
public class Chuoi {
    private String chuoi;
    public Chuoi(String str){
        chuoi = str;
    }
    public void upperCase(){
        chuoi = chuoi.toUpperCase();
    }

    public String camelCase(){
        char[]a = chuoi.toLowerCase().toCharArray();
        for(int i=0; i< a.length;i++){
           if(a[i]==' '){
               a[i+1]=Character.toUpperCase(a[i+1]);
           }
           a[0]=Character.toUpperCase(a[0]);
           }
        chuoi = String.valueOf(a);
        return chuoi=chuoi.replaceAll("\\s", "");
    }
    
    public void showChuoi(){
        
        System.out.println("Gia tri chuoi la: "+chuoi);
    }
}
