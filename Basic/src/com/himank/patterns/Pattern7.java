package com.himank.patterns;

public class Pattern7 {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (j % 2 == 1)
                    System.out.print("*");
                else if (j == 2)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }

//            Output:
//            1*0*1
//            1*0*1
//            1*0*1
//            1*0*1
}
