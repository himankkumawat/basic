package com.himank.patterns;

public class Pattern3 {

    public static void main(String[] args) {
        int i, j, k = 1;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(k);
                if (k == 1)
                    k--;
                else
                    k++;

                /*System.out.print(k%2);        // Alternative soln
                k++;*/
            }
            System.out.println();
        }
    }

//            Output:
//            10101
//            01010
//            10101
//            01010
//            10101
}
