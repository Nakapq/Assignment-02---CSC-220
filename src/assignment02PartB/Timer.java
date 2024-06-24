/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: Jack Li
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Timer {

    //
    // Static Data Fields
    //
    private static String userTimeZone;
    private static Timer timeZone;
    //
    // Instance Data Fields

    //
    private final String timeZoneFormatted;
    private static final LocalDateTime PST = LocalDateTime.now();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd  hh:mm:ss SSSS  a ");
    private static final String dateTimeFormatted = PST.format(formatter);

    //
    // Constructors
    //
    public Timer() {
        this.timeZoneFormatted = "Pacific Standard Time in Day Light Saving";
    }
    public Timer(String timeZone) {
        userTimeZone = timeZone;
        switch (timeZone.toLowerCase()) {
            case "mst" -> timeZoneFormatted = "Mountain Standard Time in Day Light Saving";
            case "cst" -> timeZoneFormatted = "Central Standard Time in Day Light Saving";
            case "est" -> timeZoneFormatted = "Eastern Standard Time in Day Light Saving";
            default -> timeZoneFormatted = "Pacific Standard Time in Day Light Saving";
        }
    }
    //
    // Static Methods
    //
    public static Timer setTimeZonePreference(){
        Messenger.getConfig().setTimer(timeZone);
        return timeZone;
    }
    public void setTimeZone(Timer timer) {
        timeZone = timer;
    }
    public static String getDateTimeFormatted() {
        return dateTimeFormatted;
    }
    //
    // Additional Static Methods
    //
    public void setUserTimeZone(String timezone) {
        userTimeZone = timezone;
    }
    public String getUserTimeZone(){
        return userTimeZone;
    }
    //
    // Instance Methods
    //
    public String getTimeZoneFormatted(){
        return this.timeZoneFormatted;
    }
    //
    // Additional Instance Methods
    //
    //
    // Language
    //
}