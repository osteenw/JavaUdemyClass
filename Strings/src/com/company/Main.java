package com.company;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        boolean isAlien = true;

        if (!isAlien) {
            System.out.println("It is not an alien!");
        }
        else {
            System.out.println("It is an alien!");
        }

        int topScore = 80;
        int secondTopScore = 85;

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Eith or both of the conditions are true");
        }

        int newValue=50;
        if (newValue == 50) {
            System.out.println("This is an error");

            boolean isCar = false;

        double doubleValue = 20.00d;
        double secondDouble = 80.00d;
        double weirdDouble;
        weirdDouble = (double) (100*(doubleValue + secondDouble));
        double modulusDouble = (double) weirdDouble % 40;
        boolean modulusBool = (modulusDouble == 0) ? true : false;

            System.out.println(weirdDouble);
            System.out.println(modulusDouble);
            System.out.println(modulusBool);

            if (!modulusBool) {
                System.out.println("Got Some Remainder");
            }


        }
    }
}
