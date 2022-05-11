package exam.sds;

import java.util.Scanner;

class AreaCalculator {
    public static double calcArea(Shape s) {
        switch(s.getClass().getSimpleName()) {
            case "Circle":
                return 3.14 * ((Circle) s).getRadius() * ((Circle) s).getRadius();
            case "Rectangle":
                return ((Rectangle) s).getLength() * ((Rectangle) s).getWidth();
            case "Square":
                return ((Square) s).getSide() * ((Square) s).getSide();
        }
        return 0;
    }
}
interface Shape {
    public void print();
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public void print() {
        System.out.println("This is a circle with area = " + AreaCalculator.calcArea(this));
    }
}

class Square implements Shape {

    private double side;

    public Square(double a){
        this.side = a;
    }

    public double getSide(){
        return side;
    }

    @Override
    public void print() {
        System.out.println("This is a square with area = " + AreaCalculator.calcArea(this));
    }

}

class Rectangle implements Shape {

    private double length, width;

    public Rectangle(double a, double b){
        this.length = a;
        this.width = b;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public void print() {
        System.out.println("This is a rectangle with area = " + AreaCalculator.calcArea(this));
    }

}

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            Shape shape = null; 
            String[] tokens = line.split(" ");
            if(tokens[0].equals("Circle"))
                shape = new Circle(Double.parseDouble(tokens[1]));
            else if(tokens[0].equals("Square"))
                shape = new Square(Double.parseDouble(tokens[1]));
            else if(tokens[0].equals("Rectangle"))
                shape = new Rectangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
            shape.print();
        }
    }
}
