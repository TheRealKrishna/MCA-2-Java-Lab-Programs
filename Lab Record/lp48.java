// Demonstrate the use of TreeSet with an example

import java.util.*;

public class lp48 {
  public static void main(String[] args) {
    Set<String> set = new TreeSet<>();
    set.add("A");
    set.add("B");
    set.add("C");
    set.remove("B");
    System.out.println("Set: " + set);
  }
}