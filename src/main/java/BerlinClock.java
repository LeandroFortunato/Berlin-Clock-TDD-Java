public class BerlinClock {

    ///              111111111122222222
    ///     0123456789012345678901234567
    ///   ("O OOOO OOOO OOOOOOOOOOO OOOO")   ----->  frame of Berlin Clock off
    ///   ("Y RRRR RRRR YYRYYRYYRYY YYYY")   ----->  frame of Berlin Clock on

    public static String transformSeconds(int seconds) {
        //first row of lights  --->  "O"
        if (seconds % 2 == 0) { //seconds = 00
            return "Y";
        }
        return "O";

    }

    public static String transformHoursOnFrameOf20Hours(int inputHours) {
        //second row of lights  --->  "OOOO"
        StringBuilder hoursFrame = new StringBuilder("OOOO");
        for (int i = 0; i < Math.floor(inputHours/5) ; i++) {
            hoursFrame.setCharAt (i, 'R');
        }
        return hoursFrame.toString();
    }

    public static String transformHoursOnFrameOf4Hours(int inputHours) {
        //third row of lights  --->  "OOOO"
        StringBuilder hoursFrame = new StringBuilder("OOOO");
        for (int i = 0; i < inputHours % 5 ; i++) {
            hoursFrame.setCharAt (i, 'R');
        }
        return hoursFrame.toString();
    }
    public static String transformMinutesOnFrameOf55Minutes(int inputMinutes) {
        //Fourth row of lights  --->  "OOOOOOOOOOO"
        StringBuilder hoursFrame = new StringBuilder("OOOOOOOOOOO");
        for (int i = 0; i < Math.floor(inputMinutes/5) ; i++) {
            if ((i + 1 )% 3 == 0) { // Red light
                hoursFrame.setCharAt (i, 'R');
            } else { // Yellow light
                hoursFrame.setCharAt (i, 'Y');
            }
        }
        return hoursFrame.toString();
    }

    public static String transformMinutesOnFrameOf4Minutes(int inputMinutes) {
        //Fourth row of lights  --->  "OOOO"
        StringBuilder hoursFrame = new StringBuilder("OOOO");
        for (int i = 0; i < inputMinutes % 5 ; i++) {
            hoursFrame.setCharAt (i, 'Y');
        }
        return hoursFrame.toString();
    }

    public static String transformFullClock(int [] time) { // [HH,MM,SS]

        StringBuilder hoursFrame = new StringBuilder("O OOOO OOOO OOOOOOOOOOO OOOO");

        ///               111111111122222222
        ///     0123456789012345678901234567
        ///   ("O OOOO OOOO OOOOOOOOOOO OOOO")   ----->  frame of Berlin Clock off
        ///   ("Y RRRR RRRR YYRYYRYYRYY YYYY")   ----->  frame of Berlin Clock on

        hoursFrame.replace (0,1,transformSeconds(time[2])); //SS
        hoursFrame.replace (2,6,transformHoursOnFrameOf20Hours(time[0])); //HH
        hoursFrame.replace (7,11,transformHoursOnFrameOf4Hours(time[0])); //HH
        hoursFrame.replace (12,23,transformMinutesOnFrameOf55Minutes(time[1])); //MM
        hoursFrame.replace (24,28,transformMinutesOnFrameOf4Minutes(time[1])); //MM

        return hoursFrame.toString();
    }

}
