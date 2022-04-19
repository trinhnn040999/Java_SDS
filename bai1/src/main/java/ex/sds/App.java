package ex.sds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Bai 1:" );
        Toan toanobj = new Toan();
        toanobj.increase();
        toanobj.increase();
        toanobj.show();
        Chuoi chuoiobj = new Chuoi("minh beo beo");
        chuoiobj.viethoa();
        chuoiobj.showChuoi();
    }
}
