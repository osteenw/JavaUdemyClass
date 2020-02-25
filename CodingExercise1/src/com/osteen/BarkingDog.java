package com.osteen;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        } else if ((barking == true) && ((hourOfDay < 8) || (hourOfDay > 22))) // We have to wake up if the dog is barking before 8 or after 22 hours
        {
            return true;
        }
        return false;
    }
}
