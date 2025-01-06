import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.Math.max;

public class longestsubstringwithoutrepeatchar_leet3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int maxlen=0;
        int cur,l=0,r=0,n=str.length();
        Set<Character>st=new HashSet<>();
        while(r<n){
            if(st.contains(str.charAt(r))){
                st.remove(str.charAt(l));
                l++;
            }
            else{
                st.add(str.charAt(r));
                cur=r-l+1;
                maxlen=max(maxlen,cur);
                r++;
            }
        }
        System.out.println(maxlen);
    }
}
/*
Test Case 1:
abcabcbb
Output:
3
Test Case 2:
bbbbb
Output:
1
Test Case 3:
pwwkew
Output:
3
 */

