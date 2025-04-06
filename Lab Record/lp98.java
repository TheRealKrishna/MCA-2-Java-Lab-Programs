// Create a program to sort a list of custom objects using a comparator.

import java.util.*;

class P {
  String n; int a;
  P(String n, int a) { this.n = n; this.a = a; }
}

public class lp98 {
  public static void main(String[] args) {
    List<P> p = Arrays.asList(new P("A",25), new P("B",30), new P("C",20));
    p.sort(Comparator.comparingInt(x -> x.a));
    p.forEach(x -> System.out.println(x.n + ": " + x.a));
  }
}

