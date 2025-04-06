// Write a program to calculate the area of a circle using a lambda expression.

interface Area {
  double calculate(double radius);
}

class lp91 {
  public static void main(String[] args) {
    double radius = 1.7;
    Area area = r -> (Math.PI * r * r);
    System.out.println("Area of the circle: " + area.calculate(radius));
  }
}
