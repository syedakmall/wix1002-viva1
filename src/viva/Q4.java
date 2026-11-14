package viva;

import java.util.Scanner;
import java.util.Arrays;

public class Q4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert string :");
        String s = in.nextLine();
        int n = s.length();  //to find the length of the string

       //tringular number formula (sum of consecutive number)
        String[] sub = new String[n * (n + 1) / 2];

       //substring part
        int k = 0;
        for (int i = 0; i < n; i++) {  // basically array[0,0]
            for (int j = i; j < n; j++) {
                sub[k] = s.substring(i, j + 1); // j+1 because it is exclusive
                k++;
            }
        }

        Arrays.sort(sub); //built in sort function

       int m = 0;
        while (m < sub.length) {
            String current = sub[m];

            // Print every position where it appears.
            for (int p = 0; p + current.length() <= n; p++) {
                if (s.startsWith(current, p)) {
                    int start = p + 1;
                    int end = p + current.length();
                    System.out.println(current + " " + start + " " + end);
                }
            }

            // Skip the copies of the same substring.
            while (m < sub.length && sub[m].equals(current)) {
                m++;
            }
        }

        in.close();

    }

}
