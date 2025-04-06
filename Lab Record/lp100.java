// Create a program to generate random numbers and sort them.

import java.util.*;

public class lp100 {
  public static void main(String[] a) {
    List<Integer> n = new ArrayList<>(new Random().ints(10,0,100).boxed().toList());
    Collections.sort(n);
    System.out.println(n);
  }
}
