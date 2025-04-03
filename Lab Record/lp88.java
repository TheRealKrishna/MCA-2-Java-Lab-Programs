// Create a program to serialize and deserialize an object.

import java.io.*;

class Person implements Serializable {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class lp88 {
  public static void main(String[] args) throws Exception {
    Person p = new Person("Alice", 25);
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
    out.writeObject(p);
    out.close();
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
    Person deserialized = (Person) in.readObject();
    in.close();
    System.out.println("Name: " + deserialized.name + ", Age: " + deserialized.age);
  }
}