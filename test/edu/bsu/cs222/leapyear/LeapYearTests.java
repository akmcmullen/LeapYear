package edu.bsu.cs222.leapyear;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTests {

    @Test
    public void testNotDivisibleBy4() {
        int year = 1997;
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.IsLeap(year);
        Assert.assertEquals(false, result);
    }

    @Test
    public void testDivisibleBy4() {
        int year = 1996;
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.IsLeap(year);
        Assert.assertEquals(true, result);
    }

}
