// Write a program to demonstrate nested try-catch blocks.

public class lp69 {
  public static void main(String[] args) {
    String[] numbers = { "10", "20", "30", "invalid", "50" };
    int sum = 0;

    for (String number : numbers) {
      try {
        sum += Integer.parseInt(number);
      } catch (NumberFormatException e) {
        System.out.println("Invalid number: " + number);
      }
    }
    System.out.println("Sum of valid numbers: " + sum);
  }
}
