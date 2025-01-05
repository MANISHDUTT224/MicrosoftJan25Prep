import java.util.Scanner;

public class signofproductofarray_leet1822 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int neg=0;
        boolean zerofound=false;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zerofound=true;
                System.out.println(0);
                break;
            }
            else if(arr[i]<0){
                neg++;
            }
        }
        if(!zerofound) {
            System.out.println((neg % 2 != 0) ? -1 : 1);
        }
    }
}
/*
Test Case 1:
[-1,-2,-3,-4,3,2,1]
Output:
1
Test Case 2:
[1,5,0,2,-3]
Output:
0
Test Case 3:
[-1,1,-1,1,-1]
Output:
-1
 */

