package com.himank.patterns;

public class Pattern53 {

    public static void main(String[] args) {
        int i, j, n = 13, k = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i < 3 && j < 3 || i > n - 3 && j < 3 || i == 3 || i == n - 2 || j == 3 || j == n - 2 || j > n - 2 && i < 3 || j > n - 2 && i > n - 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
