// Create a program to demonstrate the Factory design pattern.

abstract class Shape {
  abstract void draw();
}

class Circle extends Shape {
  void draw() {
    System.out.println("Drawing a circle");
  }
}

class ShapeFactory {
  static Shape getShape(String type) {
    return new Circle();
  }
}

public class lp94 {
  public static void main(String[] args) {
    ShapeFactory.getShape("CIRCLE").draw();
  }
}
