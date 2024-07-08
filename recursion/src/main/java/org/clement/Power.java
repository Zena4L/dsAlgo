package org.clement;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 4));

        // 2 * power(2,3) == 2 * 4 = 16
        // 2 * power(2,2) --> 2 * 2 = 4
        //2* power(2,1) --> 2 * 1 = 2
        //2* power(2,1-1) --> 1
    }

    public static long power(long x, long n) {

        //base condition
        if (n <= 0) return 1;

        return x * power(x, n - 1);
    }
}