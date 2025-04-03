// Write a program to implement a binary search.

class lp81 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("Element found at index: " + binarySearch(arr, 5));
  }

  public static int binarySearch(int[] arr, int target) {
    int l = 0, r = arr.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2;
      if (arr[m] == target)
        return m;
      if (arr[m] < target)
        l = m + 1;
      else
        r = m - 1;
    }
    return -1;
  }
}
