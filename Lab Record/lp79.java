// Write a program to handle multiple threads performing different tasks.

class lp79 {
  public static void main(String[] args) {
    new Thread(() -> System.out.println("Task 1")).start();
    new Thread(() -> System.out.println("Task 2")).start();
  }
}
