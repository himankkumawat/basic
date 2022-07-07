package com.himank.patterns;

public class Pattern8 {

    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i < 5; i++) {
            k = 65;
            for (j = 0; j < 5; j++) {
                System.out.print((char) k);
                k++;
            }
            System.out.println();
        }
    }

//      Output:
//      ABCDE
//      ABCDE
//      ABCDE
//      ABCDE
//      ABCDE
}
