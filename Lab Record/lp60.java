// Create a program to handle file not found exceptions.

import java.io.*;

public class lp60 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("null.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found!");
    }
  }
}