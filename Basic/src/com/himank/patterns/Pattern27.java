package com.himank.patterns;

public class Pattern27 {

    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

//          Output:
//                1
//               22
//              333
//             4444
//            55555
}
