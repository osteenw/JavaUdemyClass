package com.osteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth:");
//
//        boolean hasNextInt = scanner.hasNextInt();
//        if(hasNextInt){
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//
//            int age = 2020 - yearOfBirth;
//
//            if(age >= 0 && age <= 100) {
//                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
//            } else {
//                System.out.println("Invalid year of birth.");
//            }
//        } else {
//            System.out.println("Unable to parse year of birth.");
//        }
//        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//
//        int counter = 1;
//        int sum = 0;
//
//        while (counter < 11) {
//            System.out.println("Enter number #" + counter + ":");
//            if (scanner.hasNextInt()){
//                int userNumber = scanner.nextInt();
//                sum += userNumber;
//                counter++;
//            } else {
//                System.out.println("Invalid number.");
//            }
//
//            scanner.nextLine();
//
//        }
//        System.out.println("Sum of inputed numbers = " + sum);
//
//        scanner.close();
        inputThenPrintSumAverage();

    }

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
