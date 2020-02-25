package com.osteen;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        double average = 0.00;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if (scanner.hasNextInt()) {
                int userNumber = scanner.nextInt();
                count++;
                sum += userNumber;
                average = Math.round((double)sum / (double)count);
                System.out.println("SUM = " + sum + " AVG = " + average + " COUNT = " + count);
                scanner.nextLine();
            } else {
                break;
            }
        }
        int averageInt = (int) average;
        System.out.println("SUM = " + sum + " AVG = " + averageInt);
    }
}
