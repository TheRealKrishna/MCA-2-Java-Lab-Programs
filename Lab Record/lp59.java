// Write a program to list all files in a directory.

import java.io.*;

public class lp59 {
  public static void main(String[] args) {
    File dir = new File(".");
    File[] files = dir.listFiles();
    for (File file : files) {
      System.out.println(file.getName());
    }
  }
}

// output -:

// lp59.java
// lp59.class