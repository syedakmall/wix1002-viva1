package viva;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        // letters grouped by number of presses.
        String onePress = "adgjmptw";
        String twoPresses = "behknqux";
        String threePresses = "cfilorvy";
        String fourPresses = "sz";

        //  Count the presses.
        int total = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Space = key 0 once.
            if (ch == ' ') {
                total += 1;
            }
            // Check which group the letter is in.
            else if (onePress.indexOf(ch) != -1) {
                total += 1;
            } else if (twoPresses.indexOf(ch) != -1) {
                total += 2;
            } else if (threePresses.indexOf(ch) != -1) {
                total += 3;
            } else if (fourPresses.indexOf(ch) != -1) {
                total += 4;
            }
        }

        System.out.println(total);

        sc.close();
    }
}
