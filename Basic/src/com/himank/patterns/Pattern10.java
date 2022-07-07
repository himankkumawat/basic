package com.himank.patterns;

public class Pattern10 {

    public static void main(String[] args) {
        int i, j, k = 65;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print((char) k);
                k++;
            }
            System.out.println();
        }
    }

//        Output:
//        ABCDE
//        FGHIJ
//        KLMNO
//        PQRST
//        UVWXY
}
