// Create a program to implement a stack using the Stack class

import java.util.Stack;

public class lp42 {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    stack.push("A");
    stack.push("B");
    stack.push("C");
    System.out.println("popped " + stack.pop());
    System.out.println("Stack: " + stack);
  }
}