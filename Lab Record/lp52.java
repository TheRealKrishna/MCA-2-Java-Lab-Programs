// Create a program to read a file line by line.

import java.io.*;

public class lp52 {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
      br.lines().forEach(System.out::println);
    }
  }
}
