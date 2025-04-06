// Create a program to implement a producer-consumer problem.

class lp76 {
  public static void main(String[] a) {
    final Object lock = new Object();
    int[] b = new int[1];
    new Thread(() -> {
      for (int i = 0; i < 3; i++)
        synchronized (lock) {
          b[0] = i;
          System.out.println("P: " + i);
          lock.notify();
          try { lock.wait(); } catch (Exception e) {}
        }}).start();
    new Thread(() -> {
      for (int i = 0; i < 3; i++)
        synchronized (lock) {
          System.out.println("C: " + b[0]);
          lock.notify();
          try { lock.wait(); } catch (Exception e) {}
        }}).start();
  }
}
