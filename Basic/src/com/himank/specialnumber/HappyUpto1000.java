package com.himank.specialnumber;

public class HappyUpto1000 {

    public static void main(String[] args) {
        boolean j;
        int i = 1;
        while (i <= 1000) {
            if (isHappy(i))
                System.out.println(i);
            i++;
        }
    }

    private static boolean isHappy(int no) {
        while (no > 9) {
            int sum = 0;
            while (no != 0) {
                int rem = no % 10;
                sum += (rem * rem);
                no /= 10;
            }
            no = sum;
        }
        return no == 1 || no == 7;
    }
}
