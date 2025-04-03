// Write a program to demonstrate the use of java.time package.

import java.time.*;

public class lp99 {
  public static void main(String[] args) {
    System.out.println("Today's date: " + LocalDate.now());
    System.out.println("Current time: " + LocalTime.now());
    System.out.println("Current date and time: " + LocalDateTime.now());
  }
}