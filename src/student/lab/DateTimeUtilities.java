/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.HOURS;

/**
 *
 * @author cscherbert1
 */
public class DateTimeUtilities {
    
//    You must provide a minimum of two methods for converting Date/Time
//     objects to formatted strings
    
    public String dateTimeToString_AmericanFormat(LocalDateTime dateTime){
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ssa");
        String stringDateAndTime = dateTime.format(formatter);
        return stringDateAndTime;
    }
    
    public String dateTimeToString_AmericanLongFormat(LocalDateTime dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ssa");
        String stringDateAndTime = dateTime.format(formatter);
        return stringDateAndTime;
    }
    
    public String dateToString_AmericanFormat(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String stringDate = date.format(formatter);
        return stringDate;
    }    
    
//    you must provide a minimum of two
//     methods to convert formatted strings to Date/Time objects
    
    public LocalDate stringToLocalDate(String date, DateTimeFormatter formatter){
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }
    
    public LocalDateTime stringToLocalDateTime(String date, DateTimeFormatter formatter){
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        return localDateTime;
    }
    
    
//    you must provide at least one method for performing Date/Time arithmetic, such 
//     as the number of months, days, minutes, etc., between two dates.
    
    public long getChronoUnitsBetweenTwoDates(LocalDateTime start, LocalDateTime end, ChronoUnit units){
        LocalDateTime startTime = start;
        LocalDateTime endTime = end;
        long hoursBetween = units.between(startTime, endTime);
        return hoursBetween;
        
    }
    
}
