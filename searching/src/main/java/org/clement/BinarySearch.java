package org.clement;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

//        System.out.println(binarySearchIterative(arr, 5));
        System.out.println(binarySearchRecursive(arr, 0, 6, 5));
    }

    public static int binarySearchIterative(int[] arr, int val) {

        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (val == arr[mid]) {
                return mid;
            }

            if (val > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;

    }

    public static int binarySearchRecursive(int[] arr, int low, int high, int key) {

        //base condition: check if it's a single element

        if (low == high) {
            if (arr[low] == key) {
                return low;
            } else {
                return -1;
            }
        } else {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                return binarySearchRecursive(arr, mid + 1, high, key);
            } else {
                return binarySearchRecursive(arr, low, mid - 1, key);
            }
        }
    }
}