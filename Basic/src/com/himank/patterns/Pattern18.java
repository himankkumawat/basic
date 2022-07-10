package com.himank.patterns;

public class Pattern18 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }

//            Output:
//            A
//            AB
//            ABC
//            ABCD
//            ABCDE
}
