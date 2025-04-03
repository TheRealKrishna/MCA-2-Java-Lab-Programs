// Write a program to handle an array index out-of-bounds exception.

class lp65 {
  public static void main(String[] args) {
    try {
      int[] arr = { 1, 2, 3 };
      System.out.println(arr[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of bounds!");
    }
  }
}