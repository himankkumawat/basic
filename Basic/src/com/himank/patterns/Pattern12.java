package com.himank.patterns;

public class Pattern12 {

    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i < 5; i++) {
            k = 1;
            for (j = 0; j < 5; j++) {
                if (j % 2 == 1)
                    System.out.print("*");
                else {
                    System.out.print(k);
                    k++;
                }
            }
            System.out.println();
        }
    }

//            Output:
//            1*2*3
//            1*2*3
//            1*2*3
//            1*2*3
//            1*2*3
}
