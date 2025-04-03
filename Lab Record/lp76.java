// Create a program to implement a producer-consumer problem.

class lp76 {
  public static void main(String[] args) {
    final Object lock = new Object();
    int[] buffer = new int[1];
    Thread producer = new Thread(() -> {
      for (int i = 0; i < 3; i++)
        synchronized (lock) {
          try {
            lock.wait();
          } catch (Exception e) {
          }
          buffer[0] = i;
          System.out.println("Produced: " + i);
          lock.notify();
        }
    });
    Thread consumer = new Thread(() -> {
      for (int i = 0; i < 3; i++)
        synchronized (lock) {
          System.out.println("Consumed: " + buffer[0]);
          lock.notify();
          try {
            lock.wait();
          } catch (Exception e) {
          }
        }
    });
    producer.start();
    consumer.start();
  }
}
