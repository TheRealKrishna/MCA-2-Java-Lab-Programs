// Write a program to demonstrate the wait() and notify() methods.

class lp77 {
  public static void main(String[] args) {
    Object lock = new Object();
    new Thread(() -> {
      synchronized (lock) {
        try {
          lock.wait();
        } catch (Exception e) {
        }
        System.out.println("Produced");
        lock.notify();
      }
    }).start();
    new Thread(() -> {
      synchronized (lock) {
        System.out.println("Consumed");
        lock.notify();
        try {
          lock.wait();
        } catch (Exception e) {
        }
      }
    }).start();
  }
}
