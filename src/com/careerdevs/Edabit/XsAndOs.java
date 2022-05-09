package com.careerdevs.Edabit;

public class XsAndOs {
    public static boolean getXO (String str) {

        return str.replaceAll("[oO]", "").length() == str.replaceAll("[xX]", "").length();

    }
}
