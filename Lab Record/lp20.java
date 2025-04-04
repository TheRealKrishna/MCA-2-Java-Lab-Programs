// Implement a program to print Pascal’s triangle

class lp20 {
  public static void main(String[] args) {
    int rows = 5;
    for (int i = 0; i < rows; i++) {
      int number = 1;
      System.out.format("%" + (rows - i) * 2 + "s", "");
      for (int j = 0; j <= i; j++) {
        System.out.format("%4d", number);
        number = number * (i - j) / (j + 1);
      }
      System.out.println();
    }
  }
}