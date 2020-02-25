package com.osteen;

public class Sum3and5 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for(int i=1; i<=100; i++){

            if((i%3 == 0) && (i%5 == 0)){
                sum += i;
                count++;
                if (count == 5){
                    break;
                }
                System.out.println(i);
            }
        }
        System.out.println("Sum of numbers divisble by 3 and 5 = " + sum);
    }
}
