package org.clement;

public class MajorityVotes {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 2,2};
        System.out.println(majorityVotes(arr, 5));


    }

    public static int majorityVotes(int[] arr, int n) {

        if (n == 0) return -1;
        int mid = n / 2;

        //{1,3,2,2,2}
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                if (count > mid) {
                    return arr[i];
                }
            }
        }

        return -1;
    }
}
