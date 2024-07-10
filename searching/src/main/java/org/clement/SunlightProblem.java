package org.clement;

public class SunlightProblem {
    public static void main(String[] args) {
        int[] arr = {7,4,8,2,9};
        System.out.println(numberOfBuildingFacingTheSun(arr, 5));
    }

    public static int numberOfBuildingFacingTheSun(int[] arr, int n) {

       if(n == 0) return 0;

       int count = 1;

       for (int i=0; i < n - 1; i++){

           if (arr[i] < arr[i+1]){
               count++;
           }
       }

        return count;
    }
}
