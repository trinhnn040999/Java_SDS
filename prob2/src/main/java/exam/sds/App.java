package exam.sds;

import java.util.*;
class ListFullException extends Exception {
    public ListFullException() {
        super("ListFullException");
    }
}
class ToDo {
    private String task;
    private String when;
    public ToDo(String task, String when) {
        this.task = task;
        this.when = when;
    }
    public String getTask() {
        return task;
    }
    public String getWhen() {
        return when;
    }
    public void setWhen(String when) {
        this.when = when;
    }
    public void setTask(String task) {
        this.task = task;
    }
}
class ToDoList {
    private List<ToDo> thingsToDo = new ArrayList<ToDo>();
    private int maxItems;
    public ToDoList(int max) {
       this.maxItems = max;
    }
    public int getMaxItems() {
        return maxItems;
    }
    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }
    public void add(String task, String when) throws ListFullException {
        ToDo td = new ToDo(task, when);
        if (thingsToDo.size() < maxItems) 
            thingsToDo.add(td);
    }
    public int where(String task) {
        for (ToDo toDo : thingsToDo) {
            if (toDo.getTask().equals(task)) {
                return thingsToDo.indexOf(toDo);
            }
        }
        return -1;
    }
    public ToDo find(String task) {
        for (ToDo toDo : thingsToDo) {
            if (toDo.getTask().equals(task)) {
                return toDo;
            }
        }
        return null;
    }
    public int count() {
        return thingsToDo.size();
    }
}
public class App 
{
    public static void main( String[] args ) throws ListFullException
    {
        ToDoList todoList = new ToDoList(5);
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] todo = line.split(" ");
                todoList.add(todo[0], todo[1]);
        }
        sc.close();
        System.out.println(todoList.count() + " " + todoList.where("Study" ) + " " + todoList.find("Study").getTask());
    }
}
