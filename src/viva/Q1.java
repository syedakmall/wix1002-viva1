package viva;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        String isbn = m.nextLine();

        int sum = 0;
        int position = 1;

        for (int n = 0; n < isbn.length() - 1; n++) {
            char c = isbn.charAt(n);

            if (c != '-') {
                sum += (c - '0') * position;
                position++;
            }
        }

        char CheckDig;

        if (sum % 11 == 10)
            CheckDig = 'X';
        else
            CheckDig = (char) ((sum % 11) + '0');

        if (isbn.charAt(isbn.length() - 1) == CheckDig)
            System.out.println("Right");
        else {
            for (int n = 0; n < isbn.length() - 1; n++) {
                System.out.print(isbn.charAt(n));
            }
            System.out.println(CheckDig);
        }

    }
}
