// Create a program to implement a thread-safe counter.

class lp78 {
  private int count = 0;

  public synchronized void inc() { count++; }
  public synchronized int get() { return count; }

  public static void main(String[] args) throws InterruptedException {
    lp78 c = new lp78();
    Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) c.inc(); });
    Thread t2 = new Thread(() -> { for (int i = 0; i < 1000; i++) c.inc(); });
    t1.start(); t2.start(); t1.join(); t2.join();
    System.out.println(c.get());
  }
}
