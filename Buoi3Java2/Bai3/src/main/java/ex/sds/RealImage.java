package ex.sds;

public class RealImage implements Image{
    public String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    public void display(){
        loadFromDisk();
    }

    public void loadFromDisk(){
        System.out.println("Day la anh: "+fileName);
    }
}
