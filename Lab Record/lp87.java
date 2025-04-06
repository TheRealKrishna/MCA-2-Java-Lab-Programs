// Write a program to implement a simple calculator using a switch case.

public class lp87 {
  public static void main(String[] args) {
    int a = 10, b = 5;
    char operator = '+';
    double result = 0;
    switch (operator) {
      case '+': result = a + b; break;
      case '-': result = a - b; break;
      case '*': result = a * b; break;
      case '/': result = a / b; break;
    }
    System.out.println("Result: " + result);
  }
}