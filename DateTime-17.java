import java.util.Calendar;

public class DateTime17 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current date is " + cal.getTime());

        cal.add(Calendar.YEAR, 1);
        System.out.println("Day after 1 year is " + cal.getTime());

        cal.add(Calendar.YEAR, -2);
        System.out.println("Day before 1 year is " + cal.getTime());

    }
}
