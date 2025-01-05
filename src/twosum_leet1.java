
import java.util.*;

public class twosum_leet1 {
    static class Pair{
        int value,index;
        Pair(int value,int index){
            this.value=value;
            this.index=index;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        List<Pair>mp=new ArrayList<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            mp.add(new Pair(arr[i],i));
        }
        int target=s.nextInt();
        Collections.sort(mp,Comparator.comparingInt(pair->pair.value));
        int l=0,r=n-1;
        Boolean found=false;
        while(l<=r){
            int sum=mp.get(l).value+mp.get(r).value;
            if(sum==target){
                System.out.println(mp.get(l).index+" "+mp.get(r).index);
                found=true;
                break;
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        if(!found){
            System.out.println(-1+" "+-1);
        }
    }
}
/*
Test Case 1:
4
2 7 11 15
9
Output:
0 1
Test Case 2:
3
3 2 4
6
Output:
1 2
Test Case 3:
2
3 3
6
Output:
0 1
 */
