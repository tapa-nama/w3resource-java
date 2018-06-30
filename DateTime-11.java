import java.util.Calendar;

public class DateTime11 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Number of days of this month is " + cal.getActualMaximum(Calendar.DATE));
    }
}
