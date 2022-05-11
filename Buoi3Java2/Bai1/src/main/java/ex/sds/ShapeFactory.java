package ex.sds;

public class ShapeFactory {

    public Shape getShape(String shape){
        if(shape == "circle") return  new Circle();
        else if(shape == "ractangle") return  new Rectangle();
        else if(shape == "square") return  new Square();
        return null;
    }
    
}
