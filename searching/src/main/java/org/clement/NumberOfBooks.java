package org.clement;

public class NumberOfBooks {
    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 2, 6, 9};
        System.out.println(numberOfBooks(arr, 6, 3));

    }

    public static int numberOfBooks(int[] arr, int n, int max) {

        for (int i = 0; i < n; i++) {
            // he stops when arr[i] > max

            // 1,3,10,2,6,9
            if (arr[i] > max) {
                return n - (i + 1);
            }
        }

        return -1;
    }
}
