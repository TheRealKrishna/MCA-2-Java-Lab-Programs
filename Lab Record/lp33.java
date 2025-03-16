// Write a program to find the longest substring without repeating characters

class lp33 {
  public static void main(String[] args) {
    String str = "abccadbbcbbe";
    String ans = "";
    for (char c : str.toCharArray())
      if (ans.indexOf(c) == -1)
        ans += c;
    System.out.println("Longest substring without repeating characters: " + ans);
  }
}