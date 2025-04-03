// Create a program to implement a thread using the Runnable interface.

class MyRunnable implements Runnable {
  public void run() {
    for (int i = 0; i < 3; i++)
      System.out.println("Thread: " + i);
  }
}

public class lp72 {
  public static void main(String[] args) {
    Thread thread = new Thread(new MyRunnable());
    thread.start();
    for (int i = 0; i < 3; i++)
      System.out.println("Main: " + i);
  }
}