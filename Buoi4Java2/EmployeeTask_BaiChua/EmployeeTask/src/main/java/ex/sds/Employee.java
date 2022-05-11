package ex.sds;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    double total;
    List<Task> taskList = new ArrayList<>();

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public List<Task> FinishTask(Task t) {
        taskList.add(t);
        return taskList;
    }

    public void show() {
        System.out.println("Employee Name : " + name);
        for (Task task : taskList) {
            task.show();
        }
    }
    public double TotalValue(){
        total = 0;
        for(int i = 0; i < taskList.size();i++){
            total =  total + taskList.get(i).value;
        }
        return total;
    }
    public int nTasks() {
        return taskList.size();
    }
}