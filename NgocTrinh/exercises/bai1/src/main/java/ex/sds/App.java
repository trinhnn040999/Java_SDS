package ex.sds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Bai 1" );
        Toan toanObj = new Toan();
        toanObj.tang(6);
        toanObj.tang(61);
        toanObj.showCount();
        Chuoi chuoiObj = new Chuoi("xin chao con meo");
        chuoiObj.camelCase();
        chuoiObj.showChuoi();
        toanObj.fibonacci(3);
        toanObj.showFibonancii();
        return;
    }
}
