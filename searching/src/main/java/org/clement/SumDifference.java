package org.clement;

public class SumDifference {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 2};

        System.out.println(sumDifference(arr, 2));
    }

    public static int sumDifference(int[] arr, int n) {
        if (arr.length == 0) return -1;

        //{1,5,3,4,2}

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == n) {
                    count++;
                }
            }
        }

        return count;
    }
}
