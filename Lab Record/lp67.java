// Write a program to demonstrate the use of throw and throws.

class lp67 {
  static void checkAge(int age) throws Exception {
    if (age < 18)
      throw new Exception("Age must be 18 or older.");
    System.out.println("Age is valid.");
  }

  public static void main(String[] args) {
    try {
      checkAge(15);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
