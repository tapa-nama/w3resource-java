import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime35 {
    public static void main(String[] args) {
        try {
            String s1 = "2018-06-20 18:00:30";
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s1);
            String s2 = new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss").format(date);
            System.out.println(s2);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }


    }
}
