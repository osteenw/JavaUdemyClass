package com.osteen;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many integers would you like to input? \r");
        int[] integerArray = getIntegers(scanner.nextInt());

        sortArray(integerArray);

        printArray(integerArray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i=0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] sortArray(int[] integerArray) {
        int tempValue = 0;
        for(int j=0; j<integerArray.length; j++) {
            for(int i=0; i<integerArray.length; i++){
                if (i==0){
                    tempValue = integerArray[i];
                } else {
                    tempValue = integerArray[i-1];
                }

                if (integerArray[i] < tempValue) {
                    integerArray[i-1] = integerArray[i];
                    integerArray[i] = tempValue;
                    i--;
                }
            }
        }
        return integerArray;
    }

    public static void printArray(int[] integerArray) {
        for(int i=0; i < integerArray.length; i++)
            System.out.println("Element " + i + " value is " + integerArray[i]);
    }

}
