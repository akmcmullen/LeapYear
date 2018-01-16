package edu.bsu.cs222.leapyear;

public class LeapYear {
    public boolean IsLeap(int year) {
        if(year%4==0)
            return true;
        return false;
    }
}
