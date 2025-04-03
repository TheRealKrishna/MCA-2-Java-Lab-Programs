// Create a program to perform matrix multiplication.

class lp82 {
  public static void main(String[] args) throws InterruptedException {
    int[][] a = { { 1, 2 }, { 3, 4 } };
    int[][] b = { { 5, 6 }, { 7, 8 } };
    int[][] c = new int[2][2];
    Thread t1 = new Thread(() -> c[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0]);
    Thread t2 = new Thread(() -> c[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1]);
    Thread t3 = new Thread(() -> c[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0]);
    Thread t4 = new Thread(() -> c[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1]);
    t1.start(); t2.start(); t3.start(); t4.start();
    t1.join(); t2.join(); t3.join(); t4.join();
    for (int[] row : c) {
      for (int val : row) System.out.print(val + " ");
      System.out.println();
    }
  }
}