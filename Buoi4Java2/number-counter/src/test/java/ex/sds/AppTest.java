package ex.sds;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDistinctNumberCounter()
    {
        DistinctNumberCounter counter = new DistinctNumberCounter();
        assertTrue( counter.getArray() == null );
    }
    public void testDistinctNumberCounterWithLine()
    {
        DistinctNumberCounter counter = new DistinctNumberCounter("1,1,1,2");
        assertTrue( counter.getArray().length == 4 );
        assertTrue( counter.countDistinct() == 2);
    }
    public void testDistinctNumberCounterWithEmptyLine() {
        DistinctNumberCounter counter = new DistinctNumberCounter("");
        assertTrue(counter.getArray() == null);
        assertTrue(counter.countDistinct() == 0);
    }
}
