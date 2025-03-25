// Write a Java program to sort a list of numbers using Collections

import java.util.*;

public class lp45 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(1);
    list.add(2);
    Collections.sort(list);
    System.out.println("Sorted list: " + list);
  }
}
