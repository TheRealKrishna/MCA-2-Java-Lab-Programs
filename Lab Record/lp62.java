// Create a program to demonstrate the use of try, catch, and finally.

class lp62 {
  public static void main(String[] args) {
    try {
      int a = 10, b = 0;
      int c = a / b;
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero error!");
    } finally {
      System.out.println("This block always executes.");
    }
  }
}