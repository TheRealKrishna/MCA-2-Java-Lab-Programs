// Write a program to demonstrate thread priorities.

class lp75 {
  public static void main(String[] args) {
    Thread t1 = new Thread(() -> System.out.println("High Priority"));
    Thread t2 = new Thread(() -> System.out.println("Low Priority"));
    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
  }
}
