// Write a Java program to sort a list of numbers using Collections

import java.util.*;

public class lp45 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(3, 1, 2, 5, 4);
    Collections.sort(list);
    System.out.println("Sorted list: " + list);
  }
}
