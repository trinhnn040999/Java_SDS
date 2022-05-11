package ex.sds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DistinctNumberCounter counter = new DistinctNumberCounter();
        counter.readArray();
        System.out.println(counter.countDistinct());
    }
}
