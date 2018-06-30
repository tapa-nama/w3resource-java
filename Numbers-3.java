import java.util.Scanner;

public class Numbers3 {
    public static void main(String[] args) {
        System.out.print("Input the starting number of the range: ");
        Scanner in = new Scanner(System.in);
        int sNum = in.nextInt();
        System.out.print("Input the ending number of the range: ");
        int eNum = in.nextInt();
        in.close();

        int randomNum = sNum + (int) (Math.random() * ((eNum - sNum) + 1));
        System.out.println("The random number between " + sNum + " and " + eNum + " is " + randomNum);
    }
}
