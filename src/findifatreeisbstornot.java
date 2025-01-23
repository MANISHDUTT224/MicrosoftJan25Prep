import java.util.Scanner;

class findifatreeisbstornot{
    public static TreeNode insert(TreeNode root,int value){
        if(root==null){
            return new TreeNode(value);
        }
        if(root.val>value){
            root.left=insert(root.left,value);
        }
        else{
            root.right=insert(root.right,value);
        }
        return root;
    }

    public static boolean isBinarySearchTree(TreeNode root){
        return isBinarySearchTreeRecursive(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static boolean isBinarySearchTreeRecursive(TreeNode root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.val<=min ||root.val>=max){
            return false;
        }
        return isBinarySearchTreeRecursive(root.left,min,root.val) && isBinarySearchTreeRecursive(root.right,root.val,max);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        TreeNode root=null;
        for(int i=0;i<n;i++){
            int value=s.nextInt();
            root=insert(root,value);
        }
        if(isBinarySearchTree(root)){
            System.out.println("IT IS A BST");
        }
        else{
            System.out.println("IT IS NOT A BST");
        }

    }
}
/*
Test Case 1:
5
10
5
15
3
7
Output:
IT IS A BST
Test Case 2:
5
10
5
15
3
12
Output:
IT IS NOT A BST
Test Case 3:
 1
28
Output:
IT IS A BST
Test Case 4:
6
20
10
30
5
15
25
Output:
IT IS A BST
 */