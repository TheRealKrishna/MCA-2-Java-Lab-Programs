// Create a program to generate random numbers and sort them.

import java.util.*;

public class lp100 {
  public static void main(String[] args) {
    Random random = new Random();
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numbers.add(random.nextInt(100));
    }
    Collections.sort(numbers);
    System.out.println(numbers);
  }
}