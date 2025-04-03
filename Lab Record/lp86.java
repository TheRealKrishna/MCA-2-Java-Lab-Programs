// Create a program to solve the Tower of Hanoi problem.

class lp86 {
  public static void main(String[] a) {
    hanoi(3, 'A', 'C', 'B');
  }
  static void hanoi(int n, char from, char to, char aux) {
    if (n > 0) {
      hanoi(n - 1, from, aux, to);
      System.out.println("Move " + n + " from " + from + " to " + to);
      hanoi(n - 1, aux, to, from);
    }
  }
}
