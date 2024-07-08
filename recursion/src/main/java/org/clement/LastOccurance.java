package org.clement;

public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 5};

        System.out.println(lastOccurance(arr, 4, 2));
    }

    public static int lastOccurance(int[] arr, int size, int val) {

        if (size == 0) return -1;

        if (arr[size - 1] == val) return size - 1;

        return lastOccurance(arr, --size, val);

    }
}
