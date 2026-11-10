

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int i = 0;
        int result = 0;

        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) < s2.charAt(i)) {
                result = -1;
                break;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                result = 1;
                break;
            }
            i++;
        }

        if (result == 0) {
            if (s1.length() < s2.length()) {
                result = -1;
            } else if (s1.length() > s2.length()) {
                result = 1;
            }
        }

        if (result == 0)
            System.out.println("Both strings are equal");
        else if (result < 0)
            System.out.println("First string comes before second");
        else
            System.out.println("First string comes after second");

        sc.close();
    }
}
