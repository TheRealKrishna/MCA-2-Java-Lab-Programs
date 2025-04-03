// Write a program to handle divide-by-zero exceptions.

class lp61 {
  public static void main(String[] args) {
    try {
      int a = 10, b = 0;
      int c = a / b;
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero error!");
    }
  }
}