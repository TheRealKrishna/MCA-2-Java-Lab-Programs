// Write a program to demonstrate the use of ArrayList

import java.util.*;

public class lp41 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    System.out.println("removed " + list.remove(1));
    System.out.println("ArrayList: " + list);
  }
}