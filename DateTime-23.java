import java.util.Calendar;

public class DateTime23 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Months remaining in this year: " + (11 - cal.get(Calendar.MONTH)));


    }
}
