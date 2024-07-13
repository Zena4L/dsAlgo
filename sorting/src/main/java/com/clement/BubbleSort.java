package com.clement;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 7, 3, 2};
        System.out.println(Arrays.toString(bubbleSort(arr, 5)));
    }

    private static int[] bubbleSort(int[] arr, int n) {

        int flag;

        for (int i = 0; i < n - 1; i++) {
            flag = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }

            }
            if (flag == 0) break;
        }

        return arr;
    }


}