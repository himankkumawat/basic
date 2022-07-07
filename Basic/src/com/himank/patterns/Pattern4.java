package com.himank.patterns;

public class Pattern4 {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i % 2 == 0) System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        }
    }

//            Output:
//            00000
//            11111
//            00000
//            11111
//            00000
}
