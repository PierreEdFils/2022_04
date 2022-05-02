package com.careerdevs.Edabit;

public class ExistHigher {
    public static boolean existsHigher(int[] arr, int n) {
        boolean isHigher= false;
        for (int i = 0; i < arr.length ; i++) {
            if (n<=arr[i]) return true;
            
        }
            return isHigher;
//        if (arr.length == 0) return false;
//        for (int i : arr) {
//            if (i >= n) return true;
//        }
//
//        }return false;
    }
}
