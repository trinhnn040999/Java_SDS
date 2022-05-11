package ex.sds;

public class ProxyImage implements Image {
    public RealImage realImage;
    public String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        realImage = new RealImage(fileName);
    }

    public void display() {
        realImage.display();
    }
}
