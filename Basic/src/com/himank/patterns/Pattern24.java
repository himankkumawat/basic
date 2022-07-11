package com.himank.patterns;

public class Pattern24 {

    public static void main(String[] args) {
        int i, j, n = 5, k = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k);
                k++;
                if (k > 1)
                    k = 0;
            }
            System.out.println();
        }
    }

//            Output:
//            1
//            01
//            010
//            1010
//            10101
}
