// Create a program to find the largest word in a file.

import java.io.*;

public class lp58 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = null;
    br = new BufferedReader(new FileReader("file.txt"));
    System.out.println("The largest word in the file is: " + br.lines().flatMap(l -> java.util.Arrays.stream(l.split(" "))).max((a, b) -> a.length() - b.length()).orElse(""));
    if (br != null) {
      br.close();
    }
  }
}
