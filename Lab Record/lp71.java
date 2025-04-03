// Write a program to create a thread by extending the Thread class.

class MyThread extends Thread {
  public void run() {
    for (int i = 0; i < 3; i++)
      System.out.println("Thread: " + i);
  }
}

public class lp71 {
  public static void main(String[] args) {
    new MyThread().start();
    for (int i = 0; i < 3; i++)
      System.out.println("Main: " + i);
  }
}
