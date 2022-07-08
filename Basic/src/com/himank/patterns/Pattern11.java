package com.himank.patterns;

public class Pattern11 {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

//            Output:
//            12345
//            12345
//            12345
//            12345
//            12345
}
