import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class serializeandeserializebt_leet297 {
    public static String serialize(TreeNode root){
        if(root==null){
            return "";
        }
        String res="";
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        res+=String.valueOf(root.val)+",";
        while(!q.isEmpty()){
            TreeNode curnode=q.poll();
            if(curnode.left==null){
                res+="#,";
            }
            else{
                res+=String.valueOf(curnode.left.val)+",";
                q.add(curnode.left);
            }
            if(curnode.right==null){
                res+="#,";
            }
            else{
                res+=String.valueOf(curnode.right.val)+",";
                q.add(curnode.right);
            }
        }

        return res;
    }
    public static TreeNode deserialize(String data){
        if(data.length()==0){
            return null;
        }
        String []values=data.split(",");
         Queue<TreeNode>q=new LinkedList<>();
         TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        int i=1;

        while(!q.isEmpty()){
            TreeNode curnode=q.poll();
            if(values[i].equals("#")){
                curnode.left=null;
            }
            else{
                 TreeNode leftnode=new TreeNode(Integer.parseInt(values[i]));
                 curnode.left=leftnode;
                 q.add(leftnode);
            }
            i++;
            if(i>=values.length){
                break;
            }
            if(values[i].equals("#")){
                curnode.right=null;
            }
            else{
               TreeNode rightnode=new TreeNode(Integer.parseInt(values[i]));
               curnode.right=rightnode;
                q.add(rightnode);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
    String serialized1 = serialize(root1);
    System.out.println("Serialized: " + serialized1);
    TreeNode deserialized1 = deserialize(serialized1);
   System.out.println("Deserialized: " + deserialized1.val); // Expected: 1

    // Test Case 2: Full Binary Tree
    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(2);
    root2.right = new TreeNode(3);
    root2.left.left = new TreeNode(4);
    root2.left.right = new TreeNode(5);
    root2.right.left = new TreeNode(6);
    root2.right.right = new TreeNode(7);
    String serialized2 = serialize(root2);
    System.out.println("Serialized: " + serialized2);
    TreeNode deserialized2 = deserialize(serialized2);
   System.out.println("Deserialized: " + deserialized2.val); // Expected: 1

    }
}
//This can be done for 449 Serialize and Deserialize a BST as well
