// Create a program to find the shortest path in a graph using Dijkstra's algorithm.

import java.util.*;

class lp84 {
  public static void main(String[] a) {
    int[][] g = { { 0, 10, 0, 30, 100 }, { 10, 0, 50, 0, 0 }, { 0, 50, 0, 20, 10 }, { 30, 0, 20, 0, 60 },
        { 100, 0, 10, 60, 0 } };
    int[] d = { 0, 999, 999, 999, 999 };
    PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(i -> i[1]));
    for (q.add(new int[] { 0, 0 }); !q.isEmpty();)
      for (int v = 0, u[] = q.poll(); v < 5; v++)
        if (g[u[0]][v] > 0 && u[1] + g[u[0]][v] < d[v])
          q.add(new int[] { v, d[v] = u[1] + g[u[0]][v] });
    System.out.println(Arrays.toString(d));
  }
}
