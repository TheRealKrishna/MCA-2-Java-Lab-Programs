// Create a program to demonstrate the Factory design pattern.
interface Shape { void draw(); }
class Circle implements Shape {
    public void draw() { System.out.println("Circle"); }
}
class Square implements Shape {
    public void draw() { System.out.println("Square"); }
}
class ShapeFactory {
    static Shape getShape(String type) {
        return type.equals("C") ? new Circle() : new Square();
    }
}
public class lp94 {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.getShape("C");
        Shape s2 = ShapeFactory.getShape("S");
        s1.draw(); s2.draw();
    }
}
