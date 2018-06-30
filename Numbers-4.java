public class Numbers4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isKaprekarNum(i))
                System.out.print(i + " ");
        }
    }

    static boolean isKaprekarNum(int num) {
        boolean flag = false;

        if (num == 1)
            flag = true;

        int sqrt = num * num;
        int digits = 0;
        int temp = sqrt;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        for (int fDigits = 1; fDigits < digits; fDigits++) {
            int temp1 = (int) Math.pow(10, fDigits);
            if (num == temp1) continue;

            int sum = sqrt / temp1 + sqrt % temp1;
            if (sum == num)
                flag = true;
        }

        return flag;
    }
}
