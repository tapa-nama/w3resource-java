import java.util.Calendar;

public class DateTime8 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("The last date of the month is " + cal.get(Calendar.YEAR) + "-" +
                (cal.get(Calendar.MONTH) + 1) + "-" + cal.getActualMaximum(Calendar.DATE));

    }
}
