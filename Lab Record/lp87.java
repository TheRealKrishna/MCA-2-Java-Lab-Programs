// Write a program to implement a simple calculator using a switch case.

import java.util.Scanner;

public class lp87 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double num1 = sc.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = sc.nextDouble();
    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = sc.next().charAt(0);
    double result = 0;
    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        System.out.println("Error! Invalid operator.");
        break;
    }
    System.out.println("Result: " + result);
    sc.close();
  }
}