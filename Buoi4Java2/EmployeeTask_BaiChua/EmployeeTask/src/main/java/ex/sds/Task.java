package ex.sds;

public class Task {
    String name;
    double value;

    public Task() {

    }

    public Task(String n, double v) {
        this.name = n;
        this.value = v;
    }

    public void show() {
        System.out.println("Job name : " + name + " - value : " + value);
    }
}
