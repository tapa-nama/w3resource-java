import java.util.Calendar;

public class DateTime7 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("The last day of the current month is " + cal.getActualMaximum(Calendar.DATE));

    }
}
