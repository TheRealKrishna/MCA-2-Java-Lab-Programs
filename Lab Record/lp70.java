// Create a program to use a custom exception to validate user input.

class Ex extends Exception {
  Ex(String message) {
    super(message);
  }
}

public class lp70 {
  public static void main(String[] args) {
    try {
      String input = "invalidInput";
      if (!input.matches("\\d+"))
        throw new Ex("Invalid input: " + input);
      System.out.println("Valid input: " + input);
    } catch (Ex e) {
      System.out.println(e.getMessage());
    }
  }
}
