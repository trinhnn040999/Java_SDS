package ex.sds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ShapeFactory s = new ShapeFactory();
        s.getShape("circle").draw();;
    }
}
