import java.util.Calendar;

public class DateTime16 {
    public static void main(String[] args) {
        final int TWO_WEEKS = 14;
        Calendar cal = Calendar.getInstance();
        System.out.println("Current date is " + cal.getTime());
        cal.add(Calendar.DATE, TWO_WEEKS);
        System.out.println("Day after two weeks is " + cal.getTime());


    }
}
