package com.osteen;

public class FeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0)|| ((inches < 0) || (inches > 12))) {
            return -1;
        } else {
            double centimeters;
            centimeters = (feet * 30.48);
            centimeters += (inches * 2.54);
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0) {
            return -1;
        } else {
            double feet = (int) inches / 12;
            inches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
    }
}
