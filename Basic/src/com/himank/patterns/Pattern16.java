package com.himank.patterns;

public class Pattern16 {

    public static void main(String[] args) {
        int i, j;
        for (i = 5; i > 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//            Output:
//            12345
//            1234
//            123
//            12
//            1
}
