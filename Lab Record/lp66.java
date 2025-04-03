// Create a program to handle a null pointer exception.

class lp66 {
  public static void main(String[] args) {
    try {
      String str = null;
      System.out.println(str.length());
    } catch (NullPointerException e) {
      System.out.println("Null pointer exception!");
    }
  }
}