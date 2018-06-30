import java.util.Calendar;

public class DateTime2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR) + "," + cal.get(Calendar.MONTH) + "," +
                cal.get(Calendar.DATE) + "," + cal.get(Calendar.HOUR) + "," + cal.get(Calendar.MINUTE));
    }
}
