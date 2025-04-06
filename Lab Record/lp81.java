// Write a program to implement a binary search.

class lp81 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int l = 0, r = arr.length - 1, target = 5, result = -1;
    while (l <= r) {
      int m = l + (r - l) / 2;
      if (arr[m] == target){
        result = m;
        break;
      }
      if (arr[m] < target)
        l = m + 1;
      else
        r = m - 1;
    }
    System.out.println(result == -1 ? "Element not found" : "Element found at index: " + result);
  }
}
