package ex.sds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] b ={1,2,4,2,3,2,4,5};
        DistinctNumberCounter mang = new DistinctNumberCounter(b);
        mang.readArray();
        System.out.println("So phan tu khac nhau trong mang la:" +mang.countDistinct());
    }
}
