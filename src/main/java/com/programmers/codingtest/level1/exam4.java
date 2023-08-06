package com.programmers.codingtest.level1;

import java.util.Scanner;

public class exam4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int N = scanner.nextInt();

        int[] weights = new int[N];
        int[] prices = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
            prices[i] = scanner.nextInt();
        }

        int[][] dp = new int[N + 1][W + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (weights[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + prices[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[N][W]);
    }
}
