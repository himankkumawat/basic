package com.himank.patterns;

public class Pattern5 {

    public static void main(String[] args) {
        int i, j, k = 1;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(k);
                k++;
                if (k > 9)
                    k = 1;
            }
            System.out.println();
        }
    }

//            Output:
//            12345
//            67891
//            23456
//            78912
//            34567
}
