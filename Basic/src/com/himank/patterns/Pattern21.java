package com.himank.patterns;

public class Pattern21 {

    public static void main(String[] args) {
        int i, j, k = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k);
                k++;
                if (k > 9)
                    k = 1;

//                Method 2:     initialize k to 0;
//                System.out.print(k%9+1);
//                k++;
            }
            System.out.println();
        }
    }

//            Output:
//            1
//            23
//            456
//            7891
//            23456
}
