package s081;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.time.Duration;

//i LocalDateTime sono immutabili come per le stringhe

public class Time8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(LocalDate.of(2019, Month.JUNE, 2)); //formato giapponese
        System.out.println(LocalDate.of(2019, 6, 2));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))); //per formattare in modo particolare la data con "DateTimeFormatter"
        								//FormatStyle.FULL è un enumeration, una collezzione di parametri
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime ldt = LocalDateTime.of(date, time);
        System.out.println(ldt);
        
        Duration duration = Duration.ofDays(4) ;
        System.out.println(duration);
        
        TemporalUnit t = ChronoUnit.SECONDS;
        Duration durationOf = Duration.of(8, t);
        System.out.println(durationOf);
    }
}
