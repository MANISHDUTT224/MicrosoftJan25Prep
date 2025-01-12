import java.util.Scanner;

public class arrangenonegativeintoformlargestnum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String []nums=new String[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String combination1=nums[i]+nums[j];
                String combination2=nums[j]+nums[i];
                if(combination1.compareTo(combination2)<0){
                    String tempstring=nums[i];
                    nums[i]=nums[j];
                    nums[j]=tempstring;
                }
            }
        }
        for(String num:nums){
            System.out.print(num+" ");
        }

    }
}
/*
Test Case 1:
2
10
2
Output:
2 10
Test Case 2:
5
3
30
34
5
9
Output:
9 5 34 3 30


 */