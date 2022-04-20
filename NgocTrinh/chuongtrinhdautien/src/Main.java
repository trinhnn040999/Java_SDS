public class Main {
    public static void main(String args[]) {
        System.out.println("Chuong trinh dau tien cua Trinh:");
        Toan toanobj = new Toan();
        toanobj.increase();
        toanobj.increase();
        toanobj.show();

        Chuoi chuoiobj = new Chuoi("hello");
        chuoiobj.viethoa();
        chuoiobj.show();
        return;
    }
}
