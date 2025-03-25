// Create a program to find the frequency of elements in an ArrayList

import java.util.*;

public class lp46 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A", "B", "A", "C");
    Map<String, Integer> freq = new HashMap<>();
    list.forEach(s -> freq.put(s, freq.getOrDefault(s, 0) + 1));
    System.out.println("Frequency: " + freq);
  }
}
