

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long reverse = 0;
        long n = Math.abs((long) num);

        while (n > 0) {
            int digit = (int) (n % 10);
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if (num < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed Number = " + reverse);
        sc.close();
    }
}
