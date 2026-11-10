

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = (ch >= '0' && ch <= '9')
                ? "Digit"
                : ("aeiouAEIOU".indexOf(ch) >= 0)
                ? "Vowel"
                : ((ch >= 'a' && ch <= 'z') ||
                   (ch >= 'A' && ch <= 'Z'))
                ? "Consonant"
                : "Special Symbol";

        System.out.println(result);
        sc.close();
    }
}
