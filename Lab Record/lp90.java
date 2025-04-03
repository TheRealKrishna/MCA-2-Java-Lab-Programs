// Create a program to demonstrate the use of Java 8 streams.

import java.util.*;

public class lp90 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
    names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
  }
}