package com.himank.patterns;

public class Pattern26 {

    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i % 2);
            }
            System.out.println();
        }
    }

//            Output:
//            1
//            00
//            111
//            0000
//            11111
}
