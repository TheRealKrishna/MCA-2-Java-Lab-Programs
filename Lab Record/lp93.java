// Write a program to implement the Singleton design pattern.

class Singleton {
  private static final Singleton instance = new Singleton();
  private Singleton() {}
  public static Singleton getInstance() { return instance; }
  public void showMessage() { System.out.println("Hello, I am a Singleton!"); }
}

class lp93 {
  public static void main(String[] args) {
    Singleton.getInstance().showMessage();
  }
}
