// Write a program to find the union and intersection of two sets

import java.util.*;

public class lp49 {
  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
    System.out.println("Union: " + new HashSet<Integer>() {
      {
        addAll(set1);
        addAll(set2);
      }
    });
    System.out.println("Intersection: " + new HashSet<Integer>() {
      {
        addAll(set1);
        retainAll(set2);
      }
    });
  }
}
