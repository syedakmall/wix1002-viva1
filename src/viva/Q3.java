package viva;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string S: ");
        String S = sc.next();

        System.out.print("Enter target length L: ");
        long L = sc.nextLong();

        // Find the highest count of any character in string S
        long maxCount = 0;
        for (int i = 0; i < S.length(); i++) {
            int count = 0;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == S.charAt(i)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Keep doubling the most frequent character until length reaches L
        long length = S.length();
        int operations = 0;
        while (length < L) {
            length = length + maxCount;
            maxCount = maxCount * 2;
            operations++;
        }

        System.out.println("Minimum operations: " + operations);
        sc.close();
    }
}
