package org.clement;

public class NumberOfFloors {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};

        System.out.println(numberOfFloors(arr, 7, 10));
    }

    public static int numberOfFloors(int[] arr, int n, int val) {
        // array is sorted with no duplicate

        //find the largest element in A that is smaller or equal to x

        int low = 0;
        int high = n - 1;


        if (val < arr[low]) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            int mid = low + (high - low) / 2;
            if (val < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return high <= n ? high : high - 1;
    }
}
