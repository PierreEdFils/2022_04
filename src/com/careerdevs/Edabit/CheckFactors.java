package com.careerdevs.Edabit;

public class CheckFactors {
    public static boolean checkFactors(int[] factors, int num) {
        for (int i = 0 ; i < factors.length ; i++) {
            if (num % factors[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
