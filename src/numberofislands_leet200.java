import java.util.Scanner;

public class numberofislands_leet200 {
    public static void dfs(char grid[][],int n,int m,int i,int j){
        if(i==n||j==m||i<0||j<0||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,n,m,i+1,j);
        dfs(grid,n,m,i-1,j);
        dfs(grid,n,m,i,j+1);
        dfs(grid,n,m,i,j-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        char grid[][]=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=s.next().charAt(0);
            }
        }
        int islands=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    dfs(grid,n,m,i,j);
                }
            }
        }
        System.out.println("Number of islands: "+islands);
    }
}
/*
Test Case 1:
1 1 1 1 0
1 1 0 1 0
1 1 0 0 0
0 0 0 0 0
Output:
Number of islands: 1
 */
