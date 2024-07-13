package com.clement;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 4, 20, 24, 2, 10, 12};
        insertionSort(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}
