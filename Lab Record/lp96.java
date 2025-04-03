// Create a program to demonstrate the use of annotations.

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
  String value();
}

class Demo {
  @MyAnnotation(value = "This is a custom annotation")
  public void display() {
    System.out.println("Method with custom annotation executed.");
  }
}

public class lp96 {
  public static void main(String[] args) {
    Demo demo = new Demo();
    demo.display();
    try {
      MyAnnotation annotation = demo.getClass().getMethod("display").getAnnotation(MyAnnotation.class);
      if (annotation != null) {
        System.out.println("Annotation value: " + annotation.value());
      }
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
  }
}