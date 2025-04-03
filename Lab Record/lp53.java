// Write a program to count the number of words in a file.

import java.io.*;

public class lp53 {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
      int count = br.lines().mapToInt(line -> line.split(" ").length).sum();
      System.out.println("Number of words in the file: " + count);
    }
  }
}
