package com.himank.patterns;

public class Pattern36 {

    public static void main(String[] args) {
        int i, j, n = 7, k = 1, s = n / 2;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            int l = 1;
            for (j = 1; j <= k; j++) {
                System.out.print(l % 2);
                l++;
            }
            System.out.println();
            if (i <= n / 2) {
                s--;
                k = k + 2;
            } else {
                s++;
                k = k - 2;
            }
        }
    }

//    Output:
//               1
//              101
//             10101
//            1010101
//             10101
//              101
//               1
}
