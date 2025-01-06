import java.util.Scanner;

public class reversewordsinastring_leet151 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String res="";
        int i=0,n=str.length();
        while(i<n){
            while(i<n && str.charAt(i)==' '){
                i++;
            }
            if(i==n){
                break;
            }
            int j=i+1;
            while(j<n && str.charAt(j)!=' '){
                j++;
            }
            String sub=str.substring(i,j);
            if(res.length()==0){
                res=sub;
            }
            else{
                res=sub+" "+res;
            }
            i=j+1;
        }
        System.out.println(res);
    }
}
/*
Test Case 1:
the sky is blue
Output:
blue is sky the
Test Case 2:
  hello world
Output:
world hello
Test Case 3:
a good   example
Output:
example good a

 */