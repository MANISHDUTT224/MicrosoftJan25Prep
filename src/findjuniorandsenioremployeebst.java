import com.sun.source.tree.Tree;

class findjuniorandsenioremployeebst{
     TreeNode root;
     void insert(int employeeID){
        root=inserting(root,employeeID);
    }
    TreeNode inserting(TreeNode root,int employeeID){
        if(root==null){
            return new TreeNode(employeeID);
        }
        if(employeeID< root.val){
            root.left=inserting(root.left,employeeID);
        }
        else if(root.val<employeeID){
            root.right=inserting(root.right,employeeID);
        }
        return root;
    }
    int findMinimum(){
         return findMinimumRec(root);
    }
    int findMinimumRec(TreeNode root){
         while(root!=null && root.left!=null){
             root=root.left;
         }
         return root.val;
    }
    int findMaximum(){
     return findMaximumRec(root);
    }
    int findMaximumRec(TreeNode root){
         while(root!=null && root.right!=null){
             root=root.right;
         }
         return root.val;
    }
    void inorder(TreeNode root){
         if(root==null){
             return;
         }
         inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

     public static void main(String[] args){
          findjuniorandsenioremployeebst tree = new findjuniorandsenioremployeebst();

           tree.insert(15);
           tree.insert(10);
           tree.insert(20);
           tree.insert(9);
           tree.insert(12);
           tree.insert(18);
           tree.insert(29);

           System.out.println("Junior Employee(Minimum ID): " + tree.findMinimum());
           System.out.println("Senior Employee(Maximum ID): " +  tree.findMaximum());
      }

}