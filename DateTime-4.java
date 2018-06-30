import java.util.Calendar;

public class DateTime4 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current is " + cal.getTime());

        System.out.println("Actual Minimum Year is " + cal.getActualMinimum(Calendar.YEAR));
        System.out.println("Actual Minimum Month is " + cal.getActualMinimum(Calendar.MONTH));
        System.out.println("Actual Minimum Week of Year is " + cal.getActualMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual Minimum Date is " + cal.getActualMinimum(Calendar.DATE));
    }
}
