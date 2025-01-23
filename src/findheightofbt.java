import com.sun.source.tree.Tree;

public class findheightofbt{
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return Math.max(leftheight,rightheight)+1;
    }
    public static int findepth(TreeNode root,int target){
        return findepthrecurse(root,target,1);
    }
    public static int findepthrecurse(TreeNode root,int target,int currentDepth){
        if(root==null){
            return -1;
        }
        if(root.val==target){
            return currentDepth;
        }
        int leftdepth=findepthrecurse(root.left,target,currentDepth+1);
        if(leftdepth!=-1){
            return leftdepth;
        }
        return findepthrecurse(root.right,target,currentDepth+1);

    }
    public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(4);
         root.left.right = new TreeNode(5);
        System.out.println("Height of the binary tree : "+height(root));
        System.out.println("Depth of node 1 : "+findepth(root,1));
        System.out.println("Depth of node 2 : "+findepth(root,2));
        System.out.println("Depth of node 3 : "+findepth(root,3));
        System.out.println("Depth of node 4 : "+findepth(root,4));
        System.out.println("Depth of node 5 : "+findepth(root,5));
    }
}