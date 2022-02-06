
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


///              111111111122222222
///     0123456789012345678901234567
///   ("O OOOO OOOO OOOOOOOOOOO OOOO")   ----->  frame of Berlin Clock off
///   ("Y RRRR RRRR YYRYYRYYRYY YYYY")   ----->  frame of Berlin Clock on

public class BerlinClockTest {

    ///////// Block to test seconds - first row of the clock --> method transformSeconds
    @Test
    public void test00SecondsAfterMidnight () { // 00 seconds -> on
        assertEquals("Y", BerlinClock.transformSeconds(0));
    }
    @Test
    public void test59SecondsAfterMidnight () { // 59 seconds -> off
        assertEquals("O", BerlinClock.transformSeconds(59));
    }


    ///////// Block to test hours - Second row of the clock --> method transformHoursOnFrameOf20Hours
    @Test
    public void test00HoursAfterMidnightForSecondRow () { // 00 hours (just second row)
        assertEquals("OOOO", BerlinClock.transformHoursOnFrameOf20Hours(0));
    }
    @Test
    public void test05HoursAfterMidnightForSecondRow () { //  05 hours (just second row)
        assertEquals("ROOO", BerlinClock.transformHoursOnFrameOf20Hours(5));
    }
    @Test
    public void test11HoursAfterMidnightForSecondRow () { //  11 hours (just second row)
        assertEquals("RROO", BerlinClock.transformHoursOnFrameOf20Hours(11));
    }
    @Test
    public void test23HoursAfterMidnightForSecondRow () { //  23 hours (just second row)
        assertEquals("RRRR", BerlinClock.transformHoursOnFrameOf20Hours(23));
    }

    ///////// Block to test hours - Third row of the clock --> method transformHoursOnFrameOf4Hours
    @Test
    public void test00HoursAfterMidnightForThirdRow () { // 00 hours (just third row)
        assertEquals("OOOO", BerlinClock.transformHoursOnFrameOf4Hours(0));
    }
    @Test
    public void test05HoursAfterMidnightForThirdRow () { //  05 hours (just third row)
        assertEquals("OOOO", BerlinClock.transformHoursOnFrameOf4Hours(5));
    }
    @Test
    public void test11HoursAfterMidnightForThirdRow () { //  11 hours (just third row)
        assertEquals("ROOO", BerlinClock.transformHoursOnFrameOf4Hours(11));
    }
    @Test
    public void test23HoursAfterMidnightForThirdRow () { //  23 hours (just third row)
        assertEquals("RRRO", BerlinClock.transformHoursOnFrameOf4Hours(23));
    }

    ///////// Block to test minutes - Fourth row of the clock --> method transformMinutesOnFrameOf55Minutes
    @Test
    public void test00MinutesAfterMidnightForFourthRow () { // 00 minutes (just Fourth row)
        assertEquals("OOOOOOOOOOO", BerlinClock.transformMinutesOnFrameOf55Minutes(0));
    }
    @Test
    public void test05MinutesAfterMidnightForFourthRow () { // 05 minutes (just Fourth row)
        assertEquals("YOOOOOOOOOO", BerlinClock.transformMinutesOnFrameOf55Minutes(5));
    }
    @Test
    public void test09MinutesAfterMidnightForFourthRow () { // 09 minutes (just Fourth row)
        assertEquals("YOOOOOOOOOO", BerlinClock.transformMinutesOnFrameOf55Minutes(9));
    }
    @Test
    public void test10MinutesAfterMidnightForFourthRow () { // 10 minutes (just Fourth row)
        assertEquals("YYOOOOOOOOO", BerlinClock.transformMinutesOnFrameOf55Minutes(10));
    }
    @Test
    public void test16MinutesAfterMidnightForFourthRow () { // 16 minutes (just Fourth row)
        assertEquals("YYROOOOOOOO", BerlinClock.transformMinutesOnFrameOf55Minutes(16));
    }

    @Test
    public void test25MinutesAfterMidnightForFourthRow () { // 25 minutes (just Fourth row)
        assertEquals("YYRYYOOOOOO", BerlinClock.transformMinutesOnFrameOf55Minutes(25));
    }

    @Test
    public void test31MinutesAfterMidnightForFourthRow () { // 31 minutes (just Fourth row)
        assertEquals("YYRYYROOOOO", BerlinClock.transformMinutesOnFrameOf55Minutes(31));
    }
    @Test
    public void test54MinutesAfterMidnightForFourthRow () { // 54 minutes (just Fourth row)
        assertEquals("YYRYYRYYRYO", BerlinClock.transformMinutesOnFrameOf55Minutes(54));
    }
    @Test
    public void test59MinutesAfterMidnightForFourthRow () { // 59 minutes (just Fourth row)
        assertEquals("YYRYYRYYRYY", BerlinClock.transformMinutesOnFrameOf55Minutes(59));
    }


    ///////// Block to test minutes - Last row of the clock --> method transformMinutesOnFrameOf4Minutes
    @Test
    public void test00MinutesAfterMidnightForLastRow () { // 00 minutes (just last row)
        assertEquals("OOOO", BerlinClock.transformMinutesOnFrameOf4Minutes(0));
    }
    @Test
    public void test05MinutesAfterMidnightForLastRow () { // 05 minutes (just last row)
        assertEquals("OOOO", BerlinClock.transformMinutesOnFrameOf4Minutes(5));
    }
    @Test
    public void test09MinutesAfterMidnightForLastRow () { // 09 minutes (just last row)
        assertEquals("YYYY", BerlinClock.transformMinutesOnFrameOf4Minutes(9));
    }
    @Test
    public void test10MinutesAfterMidnightForLastRow () { // 10 minutes (just last row)
        assertEquals("OOOO", BerlinClock.transformMinutesOnFrameOf4Minutes(10));
    }
    @Test
    public void test16MinutesAfterMidnightForLastRow () { // 16 minutes (just last row)
        assertEquals("YOOO", BerlinClock.transformMinutesOnFrameOf4Minutes(16));
    }

    @Test
    public void test25MinutesAfterMidnightForLastRow () { // 25 minutes (just last row)
        assertEquals("OOOO", BerlinClock.transformMinutesOnFrameOf4Minutes(25));
    }

    @Test
    public void test31MinutesAfterMidnightForLastRow () { // 31 minutes (just last row)
        assertEquals("YOOO", BerlinClock.transformMinutesOnFrameOf4Minutes(31));
    }
    @Test
    public void test54MinutesAfterMidnightForLastRow () { // 54 minutes (just last row)
        assertEquals("YYYY", BerlinClock.transformMinutesOnFrameOf4Minutes(54));
    }
    @Test
    public void test59MinutesAfterMidnightForLastRow () { // 59 minutes (just last row)
        assertEquals("YYYY", BerlinClock.transformMinutesOnFrameOf4Minutes(59));
    }

    ///////// Block to test the full clock
    ///   ("O OOOO OOOO OOOOOOOOOOO OOOO")   ----->  frame of Berlin Clock off
    ///   ("Y RRRR RRRR YYRYYRYYRYY YYYY")   ----->  frame of Berlin Clock on
    @Test
    public void testFullClock1SecondAfterMidnight () { //  00:00:01  (full clock)
        assertEquals("O OOOO OOOO OOOOOOOOOOO OOOO", BerlinClock.transformFullClock(new int [] {0,0,1})); // HHMMSS
    }

    @Test
    public void testFullClock2SecondsAfterMidnight () { //  00:00:01 (full clock)
        assertEquals("Y OOOO OOOO OOOOOOOOOOO OOOO", BerlinClock.transformFullClock(new int [] {0,0,2})); // HHMMSS
    }

    @Test
    public void testFullClock59SecondsAfterMidnight () { //  00:00:59  (full clock)
        assertEquals("O OOOO OOOO OOOOOOOOOOO OOOO", BerlinClock.transformFullClock(new int [] {0,0,59})); // HHMMSS
    }

    @Test
    public void testFullClock11HoursAfterMidnight () { //  11 hours (full clock)
        assertEquals("Y RROO ROOO OOOOOOOOOOO OOOO", BerlinClock.transformFullClock(new int [] {11,0,0})); // HHMMSS
    }
    @Test
    public void testFullClock1MinuteToMidnight () { //  23:59:00  (full clock)
        assertEquals("Y RRRR RRRO YYRYYRYYRYY YYYY", BerlinClock.transformFullClock(new int [] {23,59,0})); // HHMMSS
    }

    @Test
    public void testFullClock1SecondToMidnight () { //  23:59:59 (full clock)
        assertEquals("O RRRR RRRO YYRYYRYYRYY YYYY", BerlinClock.transformFullClock(new int [] {23,59,59})); // HHMMSS
    }
    @Test
    public void testFullClockAtMidNight () { //  24:00:00 (full clock)
        assertEquals("Y RRRR RRRR OOOOOOOOOOO OOOO", BerlinClock.transformFullClock(new int [] {24,00,00})); // HHMMSS
    }
}


