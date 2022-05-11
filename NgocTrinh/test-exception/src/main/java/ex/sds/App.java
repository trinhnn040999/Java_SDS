package ex.sds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        try {

            doSomething();
        }
        catch( MyException e ) {
            System.out.println(e.getMessage());
        }
    }
    public static void doSomething() throws MyException {
        System.out.println("Lam gi do");
        int x = 10;
        if (x == 10) {
            throw new MyException();
        }
    }
}
