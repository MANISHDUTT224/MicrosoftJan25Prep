import java.util.Scanner;

public class validnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()==1 &&( s.charAt(0)=='.'||s.charAt(0)=='-'||s.charAt(0)=='+'||s.charAt(0)=='e'||s.charAt(0)=='E')){
            System.out.println("Invalid");
            return;
        }
        int ec=0;
        boolean digit=false,sign=false,exponent=false,dot=false;
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                digit=true;
                exponent=false;
                sign=false;
            }
            else if(c=='e'||c=='E'){
                if(exponent==true||digit==false){
                    System.out.println("Invalid");
                    return;
                }
                else{
                   exponent=true;
                   digit=false;
                   sign=false;
                   dot=false;
                }
            }
            else if(c=='+'||c=='-'){
                if(sign==true||dot==true||digit==true){
                    System.out.println("INVALID");
                    return;
                }
                else{
                    sign=true;
                }
            }
            else if(c=='.'){
                if(exponent==true||dot==true){
                    System.out.println("INVALID");
                    return;
                }
                else{
                    dot=true;
                }
            }
            else{
                System.out.println("INVALID");
                    return;
            }
        }
        System.out.println("VALID");
    }
}
/*
Test Case 1:
2
Output:
VALID
Test Case 2:
0089
Output:
VALID
Test Case 3:
-0.1
Output:
VALID
Test Case 4:
+3.14
Output:
VALID
Test Case 5:
-90E3
Output:
VALID
Test Case 6:
abc
Output:
INVALID
 */