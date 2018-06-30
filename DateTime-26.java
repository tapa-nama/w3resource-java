import java.time.*;


public class DateTime26 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Month month = localDate.getMonth();
        System.out.println("Integer value of the current month: " + month.getValue());
        System.out.println("Length of the month: " + month.minLength());
        System.out.println("Maximum length of the month: " + month.maxLength());
        System.out.println("First month of the Quarter: " + month.firstMonthOfQuarter());

    }
}
