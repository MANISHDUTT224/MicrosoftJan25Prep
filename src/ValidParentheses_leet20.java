import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses_leet20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Stack<Character>st=new Stack<>();
        for(Character c:str.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty() || (st.peek()!='(' && c==')') ||(st.peek()!='[' && c==']') ||(st.peek()!='{' && c=='}')){
                    System.out.println("NOT VALID");
                    return;
                }
                st.pop();
            }
        }
        System.out.println("VALID");
    }
}
/*
Test Case 1:
()
Output:
VALID
Test Case 2:
()[]{}
Output:
VALID
Test Case 3:
(]
Output:
NOT VALID
Test Case 4:
([])
Output:
VALID
Test Case 5:
]
Output:
NOT VALID
 */
