// Create a program to delete a file.

import java.io.*;

public class lp56 {
  public static void main(String[] args) {
    File file = new File("file.txt");
    if (file.exists() && file.delete()) {
      System.out.println("File deleted successfully.");
    }
  }
}