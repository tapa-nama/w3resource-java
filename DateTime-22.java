import java.util.Calendar;

public class DateTime22 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current date is " + cal.getTime());

        cal.add(Calendar.DATE, -10);
        System.out.println("Day before 10 days is " + cal.getTime());

        cal.add(Calendar.DATE, 20);
        System.out.println("Day after 10 days is " + cal.getTime());

    }
}
