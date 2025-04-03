// Write a program to copy the contents of one file to another.

import java.io.*;

public class lp57 {
  public static void main(String[] args) throws IOException {
    try (var br = new BufferedReader(new FileReader("file.txt"));
        var bw = new BufferedWriter(new FileWriter("newFile.txt"))) {
      br.transferTo(bw);
    }
    System.out.println("File copied successfully.");
  }
}
