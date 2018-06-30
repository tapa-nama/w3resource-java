import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime10 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 1);

        SimpleDateFormat sdf = new SimpleDateFormat("E");
        System.out.println("The first day of this month is " + sdf.format(cal.getTime()));

        cal.add(Calendar.DATE, cal.getActualMaximum(Calendar.DATE) - 1);
        System.out.println("The last day of this month is " + sdf.format(cal.getTime()));


    }
}
