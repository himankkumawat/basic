package com.himank.patterns;

public class Pattern29 {

    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++)
                System.out.print(" ");
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//    Output:
//            12345
//             1234
//              123
//               12
//                1
}
