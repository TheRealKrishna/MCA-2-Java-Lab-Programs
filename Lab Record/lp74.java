// Create a program to implement inter-thread communication.

class SharedResource {
  boolean available = false;
  public synchronized void produce() throws InterruptedException {
    while (available) wait();
    System.out.println("Producing..."); available = true; notify();
  }
  public synchronized void consume() throws InterruptedException {
    while (!available) wait();
    System.out.println("Consuming..."); available = false; notify();
  }
}

public class lp74 {
  public static void main(String[] args) {
    SharedResource r = new SharedResource();
    new Thread(() -> { try { for (int i = 0; i < 3; i++) r.produce(); } catch (InterruptedException e) {} }).start();
    new Thread(() -> { try { for (int i = 0; i < 3; i++) r.consume(); } catch (InterruptedException e) {} }).start();
  }
}
