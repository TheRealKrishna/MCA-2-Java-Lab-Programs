// Create a program to handle number format exceptions.

public class lp68 {
  public static void main(String[] args) {
    String numberString = "123a";
    try {
      int number = Integer.parseInt(numberString);
      System.out.println("Parsed number: " + number);
    } catch (NumberFormatException e) {
      System.out.println("Invalid number format: " + e.getMessage());
    }
  }
}