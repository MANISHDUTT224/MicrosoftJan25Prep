import java.util.*;

public class groupanagrams_leet49 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<String> strs=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n+1;i++){
            strs.add(s.nextLine());
        }
        List<List<String>> result=new ArrayList<>();
        Map<String,List<String>> mp=new HashMap<>();
        for(String str:strs){
            char tempArray[]=str.toCharArray();
            Arrays.sort(tempArray);
            String sortedString=new String(tempArray);
            if(mp.containsKey(sortedString)){
                mp.get(sortedString).add(str);
            }
            else{
                List<String> temparraystring=new ArrayList<>();
                temparraystring.add(str);
                mp.put(sortedString,temparraystring);
            }
        }
        for(Map.Entry<String,List<String>> entry: mp.entrySet()){
            result.add(entry.getValue());
        }
        for(List<String>stringarray:result){
            for(int i=0;i<stringarray.size();i++){
                System.out.print(stringarray.get(i)+" ");
            }
            System.out.println();
        }
    }
}
