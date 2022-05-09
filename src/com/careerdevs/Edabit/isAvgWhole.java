package com.careerdevs.Edabit;

public class isAvgWhole {
    public static boolean isAvgWhole(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }

        return sum % arr.length == 0 ? true : false;
    }
}
