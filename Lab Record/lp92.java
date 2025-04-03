// Create a program to demonstrate the use of Optional in Java 8.

import java.util.*;

public class lp92 {
  public static void main(String[] args) {
    Optional<String> optionalName = Optional.ofNullable(null);
    String name = optionalName.orElse("Default Name");
    System.out.println(name);
  }
}