package ex.sds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        String[] itememployee;
        Employee employee ;  
        List<Employee> employees = new ArrayList<>();
        
        for(int i = 0; i < test ;i++){
            itememployee = sc.nextLine().split(";");
            if(itememployee[0].contain)
            employee = new Employee(itememployee[0]);

            for(int j = 1 ; j < itememployee.length ; j++){
                Task task = new Task(itememployee[j].split(":")[0], Integer.parseInt(itememployee[j].split(":")[1]));

                employee.finishTask(task);
            }            
            
            employees.add(employee);
        }

        
        ArrayList<Double> a = new ArrayList<Double>();
    
        for(Employee e: employees){
            a.add(e.tongGiaTri());
        }
        for(Employee e: employees){
            if(e.tongGiaTri()==a.get(a.size()-1)){
                System.out.println("BEST:"+ e.toString());
            };
        }

        for(Employee e: employees){
            if(e.tongGiaTri()==a.get(0)){
                System.out.println("WORST:"+ e.toString());
        }}



            
        }
       
}
