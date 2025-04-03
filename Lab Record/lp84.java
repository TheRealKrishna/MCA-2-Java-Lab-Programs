// Create a program to find the shortest path in a graph using Dijkstra's algorithm.

import java.util.*;

public class lp84 {
  public static void main(String[] args) {
    int[][] graph = { { 0, 10, 0, 30, 100 }, { 10, 0, 50, 0, 0 }, { 0, 50, 0, 20, 10 }, { 30, 0, 20, 0, 60 },
        { 100, 0, 10, 60, 0 } };
    int[] dist = new int[5];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[0] = 0;
    boolean[] visited = new boolean[5];
    for (int i = 0; i < 5; i++) {
      int u = -1;
      for (int j = 0; j < 5; j++)
        if (!visited[j] && (u == -1 || dist[j] < dist[u]))
          u = j;
      visited[u] = true;
      for (int v = 0; v < 5; v++)
        if (graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v])
          dist[v] = dist[u] + graph[u][v];
    }
    System.out.println(Arrays.toString(dist));
  }
}