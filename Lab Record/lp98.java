// Create a program to sort a list of custom objects using a comparator.

import java.util.*;

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class lp98 {
  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
        new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 20));
    people.sort((p1, p2) -> Integer.compare(p1.age, p2.age));
    people.forEach(p -> System.out.println(p.name + ": " + p.age));
  }
}
