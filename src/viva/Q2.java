package viva;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean negative = false;
        if (n < 0) {
            negative = true;
            n = -n;
        }

        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        if (negative) {
            reversed = -reversed;
        }

        System.out.println(reversed);
        sc.close();
    }
}
