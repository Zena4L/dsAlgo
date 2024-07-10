package org.clement;

public class HardOrEasy {
    public static void main(String[] args) {

        int[] voters = {0,0,0,1,0};
        System.out.println(easyOrHard(voters, 5));
    }


    // {0,0,0,0,0} --> easy
    // {0,0,0,1,0} --> hard
    public static String easyOrHard(int[] voters, int n) {

        for (int i = 0; i < n; i++) {
            if (voters[i] == 1) {
                return "hard";
            }
        }

        return "easy";
    }
}
