package day18passbyvaluepassbyreferenceddatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

	public static void main(String[] args) {
		
		//Dates
		LocalDate currentDate01 = LocalDate.now();
		System.out.println(currentDate01);//2020-10-07
		
		 System.out.println(currentDate01.plusDays(3));//2020-10-10 
		 System.out.println(currentDate01);//2020-10-07  you'll see first again because LocalDate class is also immutable
		System.out.println(currentDate01.plusMonths(4));//2021-02-07 using plusMonths()
		System.out.println(currentDate01.plusYears(2));//2022-10-07
		
		System.out.println(currentDate01.minusDays(5));//2020-10-02
		System.out.println(currentDate01.minusMonths(5));//2020-05-07
		System.out.println(currentDate01.minusYears(5));//2015-10-07
		
		System.out.println(currentDate01.minusMonths(3).minusDays(2).plusYears(3));//2023-07-05
	    
		 //Time
		
		LocalTime currentTime01 = LocalTime.now();
		System.out.println(currentTime01);//19:33:28.391670 current time
		
		System.out.println(currentTime01.plusHours(2).plusMinutes(5).plusSeconds(11));//21:42:16.968360 future time
		
		System.out.println(currentTime01.minusHours(2).minusSeconds(20));//17:40:46.633788
		
		//Date and Time 
		LocalDateTime curDateTime01 = LocalDateTime.now();
	    //System.out.println(curDateTime01);/2020-10-07T19:42:51.036280  that "T" stands for time
		
		//How to update date format
		LocalDate currentDate02 = LocalDate.now();
		System.out.println(currentDate02);//2020-10-07
		
		DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd/MMM/yyyy"); //The reason why months are mentioned in uppercase is 
		//because lowercase m are used as minutes by Java. You can use any figures between the date types. day*month*year for example.
		
		System.out.println(dtf02.format(currentDate02));//07/Eki/2020
		
		//How to update time format
		LocalTime currentTime02 = LocalTime.now();
		System.out.println(currentTime02);//20:01:45.895069
		
		DateTimeFormatter dtf03 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf03.format(currentTime02.plusHours(3)));//11:03
		 
		DateTimeFormatter dtf04 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf04.format(currentTime02.plusHours(3)));//23:03 if you want to see 24 hours system, make the h uppercase
		 
	    //How to get local time of any city or country
		LocalTime localTime = LocalTime.now(ZoneId.of("Europe/Moscow"));
		System.out.println(localTime);
		
		
	}

}
