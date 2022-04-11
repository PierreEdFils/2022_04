package com.careerdevs.Edabit;

public class CountTrue {
    public static int countTrue(boolean[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++)	if(arr[i]) count++;
        return count;
    }
}
