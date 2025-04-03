// Create a program to append text to an existing file.

import java.io.*;

public class lp54 {
  public static void main(String[] args) throws IOException {
    try (FileWriter fw = new FileWriter("file.txt", true)) {
      fw.write("This is an appended text.\n");
    }
    System.out.println("Text appended successfully.");
  }
}