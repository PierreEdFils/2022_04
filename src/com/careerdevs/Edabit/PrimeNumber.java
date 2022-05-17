package com.careerdevs.Edabit;

public class PrimeNumber {

    public class Challenge {
        public static boolean isPrime (int num) {

            if(num % 2 == 0 || num < 2) return false;
            else if(num == 2) return true;
            for(int i = 3; i < Math.sqrt(num); i += 2) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }

//        public static void main(String[] args) {
//
//            int num = 29;
//            boolean flag = false;
//            for (int i = 2; i <= num / 2; ++i) {
//                // condition for nonprime number
//                if (num % i == 0) {
//                    flag = true;
//                    break;
//                }
//            }
//
//            if (!flag)
//                System.out.println(num + " is a prime number.");
//            else
//                System.out.println(num + " is not a prime number.");
//        }
    }

