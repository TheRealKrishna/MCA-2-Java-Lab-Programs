// Write a program to check if a file exists.

import java.io.*;

public class lp55 {
  public static void main(String[] args) {
    File file = new File("file.txt");
    if (file.exists()) {
      System.out.println("File exists.");
    }
  }
}