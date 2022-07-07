package com.himank.patterns;

public class Pattern6 {

    public static void main(String[] args) {
        int i, j, k = 1;
        for (i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                for (j = 0; j < 5; j++) {
                    if (j % 2 == 1)
                        System.out.print("*");
                    else
                        System.out.print("1");
                }
            } else {
                for (j = 0; j < 5; j++) {
                    if (j % 2 == 1)
                        System.out.print("*");
                    else
                        System.out.print("0");
                }
            }
            System.out.println();
        }
    }

//            Output:
//            1*1*1
//            0*0*0
//            1*1*1
//            0*0*0
//            1*1*1
}
