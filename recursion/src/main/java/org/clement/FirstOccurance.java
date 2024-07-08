package org.clement;

public class FirstOccurance {
    public static void main(String[] args) {

        // search an array and print the first occurance of a number

        int[] arr = {2, 5, 3, 5};
        System.out.println(firstOcc(arr, 0, 4, 7));

    }

    public static int firstOcc(int[] arr, int i, int size, int val) {

        if (i == size) return -1; //base condition

        if(arr[i] == val) return i;

        return firstOcc(arr, ++i, size, val);

    }

}
