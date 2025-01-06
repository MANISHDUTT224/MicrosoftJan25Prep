import java.util.ArrayList;
import java.util.Scanner;

public class finnuniqueintegersthatsumsuptozero_leet1304 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();

        for(int i=1;i<=n/2;i++){
            arr.add(i);
            arr.add(-i);
        }
        if(n%2!=0){
            arr.add(0);
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
/*
Test Case 1:
5
Output:
1 -1 2 -2 0
Test Case 2:
1
Output:
0
Test Case 3:
3
Output:
-1 1 0

 */