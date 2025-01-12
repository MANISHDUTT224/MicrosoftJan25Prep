import java.util.Scanner;

import static java.lang.Math.abs;

public class swapintegersbytwotomakethemcloser {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();

        // Convert strings to char arrays
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        int swaps = 0;

        // Iterate over the characters of the strings
        for (int i = 0; i < str1.length(); i++) {
            int minDiff = Math.abs(Integer.parseInt(new String(charArr1))
                                 - Integer.parseInt(new String(charArr2)));
            int bestJ = -1;

            for (int j = i + 1; j < str2.length(); j++) {
                // Swap temporarily to calculate the difference
                char temp1 = charArr1[i];
                char temp2 = charArr2[j];
                charArr1[i] = temp2;
                charArr2[j] = temp1;

                int newDiff = Math.abs(Integer.parseInt(new String(charArr1))
                                     - Integer.parseInt(new String(charArr2)));

                // Revert the swap
                charArr1[i] = temp1;
                charArr2[j] = temp2;

                // Check if this swap reduces the difference
                if (newDiff < minDiff) {
                    minDiff = newDiff;
                    bestJ = j;
                }
            }

            // Perform the best swap if one is found
            if (bestJ != -1) {
                char temp = charArr1[i];
                charArr1[i] = charArr2[bestJ];
                charArr2[bestJ] = temp;
                swaps++;
            }
        }

        // Calculate the final difference
        int finalDiff = Math.abs(Integer.parseInt(new String(charArr1))
                               - Integer.parseInt(new String(charArr2)));

        // Output the results
        System.out.println("Final Difference: " + finalDiff);
        System.out.println("Total Swaps: " + swaps);
    }
}
