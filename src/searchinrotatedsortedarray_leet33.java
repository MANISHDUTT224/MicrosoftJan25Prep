import java.util.Scanner;

public class searchinrotatedsortedarray_leet33 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        int i=0,j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                System.out.println("Found at index : "+mid);
                return;
            }
            if(arr[i]<=arr[mid]){
                if(arr[i]<=target && target<=arr[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        System.out.println("Not Found");

    }
}
/*
Test Case 1:
7
4 5 6 7 0 1 2
0
Output:
Found at index : 4
Test Case 2:
7
4 5 6 7 0 1 2
0
Output:
Not Found
Test Case 3:
1
1
0
Output:
Not Found
 */

