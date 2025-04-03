// Write a program to create and write to a file.

import java.io.*;

public class lp51 {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("file.txt");
    fw.write("This is a sample text file.\n");
    fw.close();
    System.out.println("File written successfully.");
  }
}