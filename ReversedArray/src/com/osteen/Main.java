package com.osteen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        int[] array = getIntegers(scanner.nextInt());

        System.out.println("Array = " + Arrays.toString(array));

        array = reverseArray(array);

        System.out.println("Array = " + Arrays.toString(array));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];

        for(int i=0; i<array.length; i++) {
            reverseArray[(array.length-1-i)] = array[i];
        }

        return reverseArray;
    }
}
