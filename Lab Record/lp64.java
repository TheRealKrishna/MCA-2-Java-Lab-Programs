// Demonstrate the use of multiple catch blocks in a program.

public class lp64 {
  public static void main(String[] args) {
    try {
      int a = 10, b = 0;
      int c = a / b;
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero error!");
    } catch (NullPointerException e) {
      System.out.println("Null pointer exception!");
    }
  }
}