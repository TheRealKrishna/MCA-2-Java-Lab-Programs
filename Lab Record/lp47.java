// Write a program to remove duplicates from a list using a Set

import java.util.*;

public class lp47 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A", "B", "A", "C", "B");
    System.out.println("List: " + list);
    Set<String> set = new HashSet<>(list);
    System.out.println("Set: " + set);
  }
}