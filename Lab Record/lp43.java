// Write a program to implement a queue using LinkedList

import java.util.*;

public class lp43 {
  public static void main(String[] args) {
    LinkedList<String> queue = new LinkedList<String>();
    queue.add("A");
    queue.add("B");
    queue.add("C");
    System.out.println("dequeued " + queue.remove());
    System.out.println("Queue: " + queue);
  }
}