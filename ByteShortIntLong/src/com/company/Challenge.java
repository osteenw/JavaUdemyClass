package com.company;

public class Challenge {

    public static void main(String[] args) {

        byte testByte = 10;
        short testShort = 20;
        int testInt = 50;
        long testLong;
        testLong = (long) (50000 + 10*(testByte + testShort + testInt));

        System.out.println(testLong);

    }
}
