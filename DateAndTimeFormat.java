import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
public class DateAndTimeFormat {
    public static void main(String[] args) {
        SimpleDateFormat obj = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        obj.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));
        System.out.println("Now  " + obj.format(System.currentTimeMillis()));
    }
    }
