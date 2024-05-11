package com.wchamara.myfirstwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

@SpringBootApplication
public class MyfirstwebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfirstwebappApplication.class, args);
        System.out.println(getShortTimeZone("America/Chicago"));
        System.out.println(getShortTimeZone("America/New_York"));
//		let's test the for all the time zones
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId + " : " + getShortTimeZone(zoneId));
        }
    }


    public static String getShortTimeZone(String zoneId) {
        ZoneId zone = ZoneId.of(zoneId);
        Instant instant = ZonedDateTime.now(zone).toInstant();
        int totalSeconds = zone.getRules().getStandardOffset(instant).getTotalSeconds();
        int totalSeconds1 = ZonedDateTime.now(zone).getOffset().getTotalSeconds();
        boolean isDaylightSaving = totalSeconds1 < totalSeconds;
        TextStyle style = isDaylightSaving ? TextStyle.SHORT : TextStyle.FULL;
        return zone.getDisplayName(TextStyle.FULL_STANDALONE, Locale.US);
    }
}
