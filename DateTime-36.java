import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTime36 {
    public static void main(String[] args) {
        long unixSecond = 2067543460;
        Date date = new Date(unixSecond * 1000l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        String date1 = sdf.format(date);
        System.out.println(date1);

    }
}
