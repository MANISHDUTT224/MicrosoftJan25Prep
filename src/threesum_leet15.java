import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class threesum_leet15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];

        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1,k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    List<Integer>temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    res.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while(j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        if(res.size()==0){
            System.out.println("No elements found");
        }
        for(List<Integer> r:res){
            for(int i:r){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
/*
Test Case 1:
6
-1,0,1,2,-1,-4
Output:
-1 -1 2
-1 0 1
Test Case 2:
3
0 1 1
Output:
No elements found
Test Case 3:
3
0 0 0
Output:
0 0 0
 */
