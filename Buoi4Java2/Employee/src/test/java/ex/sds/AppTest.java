package ex.sds;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private ByteArrayOutputStream baos;
    @Before
    public void init() throws FileNotFoundException {
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
    }
    /**
     * Rigorous Test :-)
     * 
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("input1.txt"));
        App.main(null);
        assertTrue(baos.toString(StandardCharsets.UTF_8.name()).equals("BEST:Bob-5000.0-1\r\nWORST:Peter-2130.0-3\r\n"));
    }
    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("input2.txt"));
        App.main(null);
        assertTrue(baos.toString(StandardCharsets.UTF_8.name()).equals("BEST:Peter-2130.0-3\r\nWORST:Peter-2130.0-3\r\n"));
    }
    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("input3.txt"));
        App.main(null);
        assertTrue(baos.toString(StandardCharsets.UTF_8.name()).equals("BEST:Bob-5000.0-1\r\nWORST:Susan-10.0-2\r\n"));
    }
    @Test
    public void test4() throws Exception {
        System.setIn(new FileInputStream("input.txt"));
        App.main(null);
        assertTrue(baos.toString(StandardCharsets.UTF_8.name()).equals("BEST:Bob-5000.0-1\r\nWORST:Mary-0.0-0\r\n"));
    }
}
