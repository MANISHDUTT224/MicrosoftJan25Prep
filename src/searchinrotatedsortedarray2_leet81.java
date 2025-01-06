import java.util.Scanner;

public class searchinrotatedsortedarray2_leet81 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        int l=0,r=n-1;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                System.out.println("Found at index: "+mid);
                return;
            }
            if(arr[l]==arr[mid] && arr[r]==arr[mid]){
                l++;
                r--;
            }
            if(arr[l]<=arr[mid]){
                if(arr[l]<=target && target<=arr[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[r]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        System.out.println("Not Found");
    }
}
/*
Test Case 1:
7
2 5 6 0 0 1 2
0
Output:
Found at index : 3
Test Case 2:
7
2 5 6 0 0 1 2
3
Output:
Not Found
 */