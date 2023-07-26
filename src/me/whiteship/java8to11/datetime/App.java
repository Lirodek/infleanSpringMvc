package me.whiteship.java8to11.datetime;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) throws InterruptedException {
        /*Date date = new Date();
        long time = date.getTime();
        System.out.println(date);
        System.out.println(time);         // 50초
        Thread.sleep(1000 * 3);
        Date after3Second = new Date();
        System.out.println(after3Second); // 53초
        after3Second.setTime(time);
        System.out.println(after3Second); // 50초 ???

        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        Calendar gwangMin = new GregorianCalendar(1999,Calendar.JANUARY,06); */

        // 기계적인 시간을 사용하는방법
        /*
        Instant instant = Instant.now();
        System.out.println(instant); // 기준시 UTC, GMT를 리턴한다
        System.out.println(instant.atZone(ZoneId.of("UTC"))); // 기준시 UTC, GMT를 리턴한다

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        System.out.println("======================================");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime birthDay = LocalDateTime.of(1999, Month.JANUARY, 6, 0, 0, 0);
        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(birthDay);

        LocalDate today = LocalDate.now();
        LocalDate myNextBirthDay = LocalDate.of(2024, Month.DECEMBER, 4);

        Period period = Period.between(today, myNextBirthDay);
        System.out.println(today.until(myNextBirthDay).getMonths() + "달" + today.until(myNextBirthDay).getDays() + "일");
        */
        /*
        Instant now = Instant.now();
        Instant plus = now.plus(10, ChronoUnit.SECONDS);
        Duration between = Duration.between(now, plus);
        System.out.println(between.getSeconds());

        LocalDateTime nowDateTime = LocalDateTime.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(nowDateTime.format(MMddyyyy));

        LocalDate parse = LocalDate.parse("07/15/1982", MMddyyyy);
        System.out.println(parse); */

        Date date = new Date();
        Instant instant = date.toInstant();
        Date from = Date.from(instant);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        LocalDateTime localDateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        ZonedDateTime zonedDateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault());
        GregorianCalendar from1 = GregorianCalendar.from(zonedDateTime);

        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();
        TimeZone.getTimeZone(zoneId);

    }
}
