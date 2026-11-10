

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check whether number is power of 4
        boolean powerOf4 = false;
        int n = num;

        if (n > 0) {
            while (n % 4 == 0) {
                n >>= 2;
            }

            powerOf4 = (n == 1);
        }

        if (powerOf4) {
            System.out.println("Number is a Power of 4");
        } else {
            System.out.println("Number is not a Power of 4");
        }

        // Toggle 3rd bit (bit position 2)
        int toggled = num ^ (1 << 2);

        System.out.println("After Toggling 3rd Bit = " + toggled);

        // Multiplication table
        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 20; i++) {

            int result = num * i;

            if (result % 6 == 0) {
                continue;
            }

            if (result % 48 == 0) {
                System.out.println("Stopped at multiple of 48: " + result);
                break;
            }

            System.out.println(num + " x " + i + " = " + result);
        }

        sc.close();
    }
}
