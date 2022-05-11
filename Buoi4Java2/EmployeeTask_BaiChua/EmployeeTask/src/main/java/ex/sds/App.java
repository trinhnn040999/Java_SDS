package ex.sds;

import static java.util.Collections.sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        
        List<Employee> emplist = new ArrayList<Employee>();
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            String tokens[] = line.split(";");
            String name = tokens[0];
            Employee e = new Employee(name);
            for (int j = 1; j < tokens.length; j ++) {
                String subTokens[] = tokens[j].split(":");
                double value = 0;
                try {
                    value = Double.parseDouble(subTokens[1]);
                }
                catch (Exception e1) {

                }
                Task t = new Task(subTokens[0], value);
                e.FinishTask(t);
            }
            emplist.add(e);
        }
        sort(emplist, new EmployeeComparator());
        Employee best = emplist.get(0);
        Employee worst = emplist.get(emplist.size() - 1);
        System.out.println("BEST:" + best.name + "-" + best.TotalValue() + "-" + best.nTasks());
        System.out.println("WORST:" + worst.name + "-" + worst.TotalValue() + "-" + worst.nTasks());
    }
}
