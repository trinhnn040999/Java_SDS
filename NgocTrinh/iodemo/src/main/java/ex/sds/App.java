package ex.sds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        PrintStream out = new PrintStream(new File("log3.data"));
        out.println("Hello");
        out.close();
    

    BufferedReader reader = new BufferedReader(new FileReader("data.log")){
        String line = reader.readLine();
        while(line != null){
            System.out.println(line);
            line = reader.readLine();
        }
    }
    }
}
