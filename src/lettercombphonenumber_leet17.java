import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lettercombphonenumber_leet17 {
    public static void backtrack(String comb,String nextdigits,ArrayList<String>phone_map,ArrayList<String>output){
        if(nextdigits.isEmpty()){
            output.add(comb);
        }
        else{
            String letters=phone_map.get(nextdigits.charAt(0)-'2');
            for(char letter:letters.toCharArray()){
                backtrack(comb+letter,nextdigits.substring(1),phone_map,output);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String digits=s.nextLine();
        ArrayList<String>phone_map=new ArrayList<>(Arrays.asList("abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
        if(digits.length()==0){
            System.out.println("[]");
            return;
        }
        ArrayList<String> output=new ArrayList<>();
        backtrack("",digits,phone_map,output);

        for(String str:output){
            System.out.print(str+" ");
        }

    }
}
/*
Test Case 1:
23
Output:
ad ae af bd be bf cd ce cf
Test Case 2:
""
Output:
[]
Test Case 3:
2
Output:
a b c

 */
