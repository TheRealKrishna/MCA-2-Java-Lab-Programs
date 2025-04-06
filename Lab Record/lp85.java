// Write a program to implement a binary tree and perform in-order traversal.

class Node { int data; Node left, right;
  Node(int value) { data = value; } }
class lp85 { Node root;
  void inOrderTraversal(Node node) {
    if (node != null) { inOrderTraversal(node.left);
      System.out.print(node.data + ", ");
      inOrderTraversal(node.right); } }

  public static void main(String[] args) {
    lp85 tree = new lp85();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.inOrderTraversal(tree.root); } }
