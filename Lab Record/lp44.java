// Create a program to iterate through a HashMap

import java.util.*;

public class lp44 {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("A", "Apple");
    map.put("B", "Banana");
    map.put("C", "Cherry");
    for (String key : map.keySet()) {
      System.out.println(key + ": " + map.get(key));
    }
  }
}