public class findsumandcountofbooks {
    public static TreeNode insert(TreeNode root,int id){
        if(root==null){
            return new TreeNode(id);
        }
        if(id<root.val){
            root.left=insert(root.left,id);
        }
        else if(id>root.val){
            root.right=insert(root.right,id);
        }
        return root;
    }
    public static int[] SumandCount(TreeNode root){
        int result[]=new int[2];
        if(root==null){
            return result;
        }
        int leftresult[]=SumandCount(root.left);
        int rightresult[]=SumandCount(root.right);
        result[0]=root.val+leftresult[0]+rightresult[0];
        result[1]=1+leftresult[1]+rightresult[1];
        return result;
    }
    public static void main(String[] args){
          TreeNode root = null;

          int[] bookIds = {50,30,70,20,40,60,80};
          for(int id : bookIds){
              root = insert(root,id);
          }

          int[] result = SumandCount(root);

          System.out.println("Sum of all the Book IDS:" + result[0]);
          System.out.println("Total no of books:" + result[1]);

      }
}
