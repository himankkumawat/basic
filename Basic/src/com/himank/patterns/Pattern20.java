package com.himank.patterns;

public class Pattern20 {

    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 6; i++) {
            k = 64;
            for (j = 1; j <= i; j++) {
                System.out.print((char) (i + k));
                k++;
            }
            System.out.println();
        }
    }

//    Output:
//    A
//    BC
//    CDE
//    DEFG
//    EFGHI
//    FGHIJK
}
