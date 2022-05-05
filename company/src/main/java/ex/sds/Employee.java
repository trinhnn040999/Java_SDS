package ex.sds;

public class Employee {
    private int id;
    
    private String name;
    private String position;
    public Employee(int id) {
        this.setId(id);
    }
    public Employee(int id, String name, String position) {
        this.setId(id);
        this.setName(name);
        this.setPosition(position);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return e.id == this.id;
    }
    public int hashCode() {
        return new Integer(this.id).hashCode();
    }
    public String toString() {
        return id + "\t" + name + "\t" + position;
    }
}
