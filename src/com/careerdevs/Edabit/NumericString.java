package com.careerdevs.Edabit;

public class NumericString {public static String add(String a, String b) {


    if( a == null || b == null || a.equals ("") || b.equals ("") ){
        return "Invallid Operation";
    }
    int num = Integer.parseInt(a);
    int num1 =Integer.parseInt(b);
    int sum2 =num + num1;
    return String.valueOf(sum2);

//    try {
//        if( a == null || b == null || a.equals ("") || b.equals ("") ){
//            return "Invallid Operation";
//        }
//    }
//    catch (Exception e){
//
//    }
}
}
