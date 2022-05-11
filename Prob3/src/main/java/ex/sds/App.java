package ex.sds;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        List<String> res = new ArrayList<String>();
        String line;
        while((line = sc.nextLine()) != null && line.length() > 0){
            if(line.charAt(0) != ';' && line.charAt(0) != '#' && line.indexOf("SDS 2022") != -1){
                res.add(line);
            }
        }
        
        sc.close();
        for(String s: res){
            System.out.println(s);
        }
    }
}
