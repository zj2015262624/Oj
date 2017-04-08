package com.company.beauty;

import java.util.Scanner;

public class Tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String x1 = sc.nextLine();
            String y1 = sc.nextLine();
            int x = Integer.parseInt(x1);
            int y = Integer.parseInt(y1);
            int[][] weight = {
                    {0, 2, 10, 5, 3, 1000},
                    {1000, 0, 12, 1000, 1000, 10},
                    {1000, 1000, 0, 1000, 7, 1000},
                    {2, 1000, 1000, 0, 2, 1000},
                    {4, 1000, 1000, 1, 0, 1000},
                    {3, 1000, 1, 1000, 2, 0}

            };

            int[] path = Dijsktra(weight, x);
            System.out.println(path[y]);
        }
    }

    public static int[] Dijsktra(int[][] weight, int start) {
        int n = weight.length;
        int[] shortPath = new int[n];
        int[] visited = new int[n];

        shortPath[start] = 0;
        visited[start] = 1;

        for (int count = 1; count <= n - 1; count++) {
            int k = -1;
            int min = 1000;
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0 && weight[start][i] < min) {
                    min = weight[start][i];
                    k = i;
                }
            }
            shortPath[k] = min;
            visited[k] = 1;
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i])
                    weight[start][i] = weight[start][k] + weight[k][i];
            }

        }

        return shortPath;
    }

}
