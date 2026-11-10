

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int multiply = num << 2;
        int divide = num >> 2;

        System.out.println("After Multiplication by 4 = " + multiply);
        System.out.println("After Division by 4 = " + divide);

        sc.close();
    }
}
