// Create a program to implement a PriorityQueue

import java.util.*;

public class lp50 {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    pq.add(15);
    pq.add(10);
    pq.add(20);
    System.out.println("Dequeued Element: " + pq.poll());
    System.out.println("Priority Queue: " + pq);
  }
}