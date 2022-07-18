package com.himank.patterns;

public class Pattern50 {

    public static void main(String[] args) {
        int i, j, n = 4, k;
        for (i = 1; i <= n; i++) {
            k = i;
            for (j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k + n - j;
            }
            System.out.println();
        }
    }

//            Output:
//            1
//            2 5
//            3 6 8
//            4 7 9 10
}
