package com.himank.patterns;

public class pattern42 {

    public static void main(String[] args) {
        int i, j, n = 5, k = 1;
        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print(k % 2);
                k++;
            }
            System.out.println();
        }
    }

//              Output:
//                1
//               010
//              10101
//             0101010
//            101010101
}
