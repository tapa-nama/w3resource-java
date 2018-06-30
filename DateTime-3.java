import java.util.Calendar;

public class DateTime3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current is " + cal.getTime());

        System.out.println("Actual Maximum Year is " + cal.getActualMaximum(Calendar.YEAR));
        System.out.println("Actual Maximum Month is " + cal.getActualMaximum(Calendar.MONTH));
        System.out.println("Actual Maximum Week of Year is " + cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual Maximum Date is " + cal.getActualMaximum(Calendar.DATE));
    }
}
