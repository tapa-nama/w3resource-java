import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class DateTime5 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New York: " + sdf.format(new Date()));
    }

}
