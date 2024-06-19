package Files;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class LocalDateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LocalDate currentDate=LocalDate.now();
     System.out.println("Today's date "+currentDate);
     
     LocalDate parseDate=LocalDate.parse("2003-06-23");
     System.out.println(parseDate);
     LocalDate specificDate=LocalDate.of(2004,2,16);
     System.out.println(" this is the specificdate:"+specificDate);
     LocalDate nextMonth=specificDate.plusMonths(1);
     System.out.println(nextMonth);
     
     //specific time
     LocalTime specifictime=LocalTime.of(6,42);
     System.out.println(specifictime);
     
     LocalTime time=LocalTime.of(14, 35);
     System.out.println(time);
     
     LocalTime latertime=time.plusHours(2);
     System.out.println(latertime);
     LocalDateTime currentDateTime=LocalDateTime.now();
     System.out.println("Today's date :"+currentDateTime);
	}

}
