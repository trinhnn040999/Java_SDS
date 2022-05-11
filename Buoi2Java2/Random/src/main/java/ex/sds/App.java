package ex.sds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RandomStringGenerator ran = new RandomStringGenerator(3, 1);
        System.out.println(ran.generate(4));
    }
}
