import java.util.Scanner;

public class findmissingobservations_leet2028 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rollsize=s.nextInt();
        int rolls[]=new int[rollsize];
        for(int i=0;i<rollsize;i++){
            rolls[i]=s.nextInt();
        }
        int mean=s.nextInt();
        int missingobservations=s.nextInt();
        int knownrollsum=0;
        for(int roll:rolls){
            knownrollsum+=roll;
        }
        int totalrollsum=mean*(rolls.length+missingobservations);
        int unknownrollsum=totalrollsum-knownrollsum;
        int result[]=new int[missingobservations];
        if(unknownrollsum<missingobservations||unknownrollsum>missingobservations*6){
            System.out.println("[]");
            return;
        }
        int value=unknownrollsum/missingobservations;
        int extra=unknownrollsum%missingobservations;
        for(int i=0;i<missingobservations;i++){
            result[i]=value+(i<extra?1:0);
        }
        for(int i:result){
            System.out.print(i+" ");
        }

    }
}
/*
Test Case 1:
4
3 2 4 3
4
2
Output:
6 6
Test Case 2:
3
1 5 6
3
4
Output:
3 2 2 2  Note:order doesn't matter
Test Case 3:
4
1 2 3 4
6
4
Output:
[]
 */
