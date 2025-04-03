// Write a program to implement a generic method.

class lp97 {
  public static <T> void printArray(T[] array) {
    for (T element : array) System.out.print(element + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    printArray(new Integer[]{1, 2, 3, 4, 5});
    printArray(new String[]{"Hello", "World"});
  }
}
