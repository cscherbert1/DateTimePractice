package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import static java.time.format.DateTimeFormatter.ofLocalizedDateTime;
import java.time.format.FormatStyle;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.SECONDS;

/**
 *
 * @author cscherbert1
 * @version 1.0
 * @since 4/17/2017
 */
public class Startup {

    public static void main(String[] args) {

        DateTimeUtilities dateTime = new DateTimeUtilities();

        //output the date/ time right now as a string
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dateTime.dateTimeToString_AmericanLongFormat(now));

        LocalDate today = LocalDate.now();
        System.out.println(dateTime.dateToString_AmericanFormat(today));
        

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = "04/17/2017";
        LocalDate localDate = dateTime.stringToLocalDate(date, formatter);
        System.out.println("localDate = " + localDate);
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        String currentDate = "04/17/2017 15:38";
        LocalDateTime localDateTime = dateTime.stringToLocalDateTime(currentDate, dateTimeFormatter);
        System.out.println(localDateTime);
        
        LocalDateTime startDate = LocalDateTime.of(2016, Month.DECEMBER, 24, 12, 00);
        LocalDateTime endDate = LocalDateTime.of(2017, Month.DECEMBER, 24, 12, 00);
        Long unitsBetween = dateTime.getChronoUnitsBetweenTwoDates(startDate, endDate, SECONDS);
        System.out.println("Units Between: " + unitsBetween);
        
        




    }
}
