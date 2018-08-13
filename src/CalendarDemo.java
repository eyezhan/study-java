import java.util.*;

public class CalendarDemo {
    public static void main(String args[]) {
        Calendar c1 = Calendar.getInstance();
        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH) + 1;
        int date = c1.get(Calendar.DATE);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int minute = c1.get(Calendar.MINUTE);
        int second = c1.get(Calendar.SECOND);
        int day = c1.get(Calendar.DAY_OF_WEEK);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Date: " + date);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Day: " + day);
    }
}
