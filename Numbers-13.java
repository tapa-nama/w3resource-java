import java.util.Scanner;

public class Numbers13 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPronic(n) ? "Pronic Number" : "Not a Pronic Number");
    }

    static boolean isPronic(int num) {
        int ans = 0;
        for (int i = 0; i < num; i++) {
            if (i * (i + 1) == num) {
                ans = 1;
                break;
            }
        }
        return ans == 1;

    }
}
