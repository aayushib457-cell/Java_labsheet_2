

public class Q19 {
    public static void main(String[] args) {

        System.out.println("Armstrong Numbers between 1 and 1000:");

        for (int i = 1; i <= 1000; i++) {
            int num = i;
            int sum = 0;
            int digits = String.valueOf(i).length();

            while (num > 0) {
                int digit = num % 10;
                sum += (int) Math.pow(digit, digits);
                num /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
