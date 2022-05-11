package ex.sds;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    List<Task> taskDone = new ArrayList<Task>();
    public Employee(String name) {
        this.setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void finishTask(Task t){
        taskDone.add(t);
    }
    public String toString(){
        return (getName() + "-"+tongGiaTri() + "-"+ taskDone.size());
    }
    public double tongGiaTri(){
        double sum =0;
        for(Task t: taskDone){
            sum +=t.getValue();
        }
        return sum;
    }
    
}
