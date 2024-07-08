package org.clement;

public class Fibonacci {
    public static void main(String[] args) {
        // sum of last two digits
        //fibonacci f(n) = Fn-1 + Fn-2
        //where F0 = 0 and F1= 1

        System.out.println(fibonacci(7));

    }

    public static int fibonacci(int n) {

        //base case = it should always be +ve number
        if (n <= 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
