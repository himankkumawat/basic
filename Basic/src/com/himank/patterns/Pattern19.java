package com.himank.patterns;

public class Pattern19 {

    public static void main(String[] args) {
        int i, j, k = 65;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((char) k);
                k++;
            }
            System.out.println();
        }
    }

//    Output:
//    A
//    BC
//    DEF
//    GHIJ
//    KLMNO
}
