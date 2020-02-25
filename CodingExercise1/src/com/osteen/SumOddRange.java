package com.osteen;

public class SumOddRange {
    public static boolean isOdd(int n) {
        if (n <= 0) {
            return false;
        } else if (n % 2 == 1) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if ((end < start) || (start <= 0) || (end <= 0)) {
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
