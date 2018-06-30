public class Numbers6 {
    public static void main(String[] args) {
        for (int i = 0, count = 0; count < 15; i++) {
            if (isNarcissistic(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    static boolean isNarcissistic(int n) {
        int temp = n;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = n;
        int sum = 0;
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }
}
