package viva;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        String password = m.nextLine();

        while (password.indexOf('[') != -1) {

            int start = password.lastIndexOf('[');
            int end = password.indexOf(']', start);

            int number = 0;
            int i = start + 1;

            while (i < end && password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                number = number * 10 + (password.charAt(i) - '0');
                i++;
            }

            String part = "";

            for (int j = i; j < end; j++) {
                part += password.charAt(j);
            }

            String repeated = "";

            for (int j = 0; j < number; j++) {
                repeated += part;
            }

            String result = "";

            for (int j = 0; j < start; j++) {
                result += password.charAt(j);
            }

            result += repeated;

            for (int j = end + 1; j < password.length(); j++) {
                result += password.charAt(j);
            }

            password = result;
        }

        System.out.println(password);
    }
}
