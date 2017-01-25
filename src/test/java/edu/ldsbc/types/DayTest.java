package edu.ldsbc.types;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by XPS on 1/14/2017.
 */
public class DayTest {

    @Test
    public void dayTest() throws Exception {
        Day day1 = Day.SUNDAY;
        Day day2 = Day.MONDAY;
        Day day3 = Day.TUESDAY;

        assertEquals("Church", tellItLikeItIs(day1));
        assertEquals("Family home evning", tellItLikeItIs(day2));
        assertEquals("Cub Scouts", tellItLikeItIs(day3));
    }

    private String tellItLikeItIs(Day day){
        String returnValue = "";
        switch (day){
            case SUNDAY:
                returnValue = "Church";
                break;
            case MONDAY:
                returnValue = "Family home evning";
                break;
            case TUESDAY:
                returnValue = "Cub Scouts";

        }
        return returnValue;
    }

}