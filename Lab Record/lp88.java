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
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
    out.writeObject(new Person("Alice", 25));
    out.close();
    Person p = (Person) new ObjectInputStream(new FileInputStream("person.ser")).readObject();
    System.out.println("Name: " + p.name + ", Age: " + p.age);
  }
}
