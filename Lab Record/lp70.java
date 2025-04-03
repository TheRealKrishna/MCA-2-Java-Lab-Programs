// Create a program to use a custom exception to validate user input.

class InvalidInputException extends Exception {
  InvalidInputException(String message) {
    super(message);
  }
}

public class lp70 {
  public static void main(String[] args) {
    try {
      validateInput("invalidInput");
    } catch (InvalidInputException e) {
      System.out.println(e.getMessage());
    }
  }

  static void validateInput(String input) throws InvalidInputException {
    if (!input.matches("\\d+"))
      throw new InvalidInputException("Invalid input: " + input);
    System.out.println("Valid input: " + input);
  }
}
