package com.himank.patterns;

public class Pattern17 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j < (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//            Output:
//            *
//            ***
//            *****
//            *******
//            *********
}
