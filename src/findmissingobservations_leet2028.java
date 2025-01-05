import java.util.Scanner;

public class findmissingobservations_leet2028 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rollsize = s.nextInt();
        int[] rolls = new int[rollsize];

        int mean;
        for(mean = 0; mean < rollsize; ++mean) {
            rolls[mean] = s.nextInt();
        }

        mean = s.nextInt();
        int missingobservations = s.nextInt();
        int knownrollsum = 0;
        int[] var7 = rolls;
        int unknownrollsum = rolls.length;

        int value;
        for(int var9 = 0; var9 < unknownrollsum; ++var9) {
            value = var7[var9];
            knownrollsum += value;
        }

        int totalrollsum = mean * (rolls.length + missingobservations);
        unknownrollsum = totalrollsum - knownrollsum;
        int[] result = new int[missingobservations];
        if (unknownrollsum >= missingobservations && unknownrollsum <= missingobservations * 6) {
            value = unknownrollsum / missingobservations;
            int extra = unknownrollsum % missingobservations;

            for(int i = 0; i < missingobservations; ++i) {
                result[i] = value + (i < extra ? 1 : 0);
            }

            int[] var18 = result;
            int var13 = result.length;

            for(int var14 = 0; var14 < var13; ++var14) {
                int i = var18[var14];
                System.out.print("" + i + " ");
            }

        } else {
            System.out.println("[]");
        }
    }
}
