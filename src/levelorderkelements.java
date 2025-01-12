import java.util.Scanner;

////import java.util.*;
////class TNode
////{
////    int data;
////    TNode left;
////    TNode right;
////    TNode(int data)
////    {
////        this.data = data;
////        this.left = null;
////        this.right = null;
////    }
////}
////class BST
////{
////    TNode root;
////    void create(int num)
////    {
////        TNode Newnode = new TNode(num);
////        if(root == null)
////        {
////            root = Newnode;
////        }
////        else
////        {
////            TNode tptr = root;
////            TNode prev = null;
////            while(tptr != null)
////            {
////                prev = tptr;
////                if(num > tptr.data)
////                    tptr = tptr.right;
////                else
////                    tptr = tptr.left;
////            }
////            if(prev.data > num)
////                prev.left = Newnode;
////            else
////                prev.right = Newnode;
////        }
////    }
////    int find_level(TNode root , int k)
////    {
////        TNode tptr = root;
////        int count = 1;
////        while(tptr != null && tptr.data != k)
////        {
////            count++;
////            if(k > tptr.data)
////                tptr = tptr.right;
////            else
////                tptr = tptr.left;
////        }
////        if(tptr == null) return 0;
////        else return count;
////    }
////    boolean print_siblings(TNode root , int k , int level)
////    {
////        if(root == null)
////            return false;
////        if(level == 1 && root.data != k)
////        {
////            System.out.print(root.data+" ");
////            return true;
////        }
////        boolean left = print_siblings(root.left, k, level-1);
////        boolean right = print_siblings(root.right, k, level-1);
////        return left || right;
////    }
////    void find_siblings(int k)
////    {
////        int level = find_level(root,k);
////        if(level == 0 || root.data == k)
////        {
////            System.out.print("No siblings found");
////        }
////        else
////        {
////            if(print_siblings(root,k,level) == false)
////                System.out.print("No siblings found");
////        }
////    }
////     void inorder(TNode root)
////     {
////         if(root != null)
////         {
////             inorder(root.left);
////             System.out.print(root.data+" ");
////             inorder(root.right);
////         }
////     }
////     void display()
////     {
////         inorder(root);
////     }
////}
////
////public class levelorderkelements
////{
////    public static void main(String[] args)
////    {
////        Scanner input = new Scanner(System.in);
////        BST tree = new BST();
////        while(true)
////        {
////            int num = input.nextInt();
////            if(num == -1) break;
////            tree.create(num);
////        }
////        int k = input.nextInt();
////        tree.find_siblings(k);
////        System.out.println();
////        tree.display();
////        input.close();
////    }
////}
////
////
/////*
////
////1 coding questions on level order tree to print k element siblings
////
////
////            4(settings)
////          /   \
////         /     \
////(network)2      6(display)
////       /  \    /  \
////(wifi)1(sim)3 5(font)7(brightness)     prev = 7
////                      \
////                       null            tptr = null
////
////Input tree
////K=5
////
////Output : 1 3 7
////
////
////1)Binary Search tree creation
////2)search for a position of a given data
////3)level order traverssal for the same level of the given data
////
////
////Queue , stack , looping , recursive ,
////looping , recursive
////
////1 2 3 4 5 6 7 8 9 10 ->
////
////
////        k
////       / \
////      i   j
////
//
//import java.util.Scanner;
//
//class TNode{
//    int data;
//    TNode left,right;
//    TNode(int data){
//        this.data=data;
//        this.left=this.right=null;
//    }
//}
//class BS{
//    TNode root;
//    void create(int data){
//        TNode newnode=new TNode(data);
//        if(root==null){
//            root=newnode;
//        }
//        else{
//            TNode tptr=root,prev=null;
//            while(tptr!=null && tptr.data!=data){
//                prev=tptr;
//                if(data>tptr.data){
//                    tptr=tptr.right;
//                }
//                else{
//                    tptr=tptr.left;
//                }
//            }
//            if(prev.data>data){
//                prev.left=newnode;
//            }
//            else{
//                prev.right=newnode;
//            }
//        }
//    }
//    void inorder(TNode root){
//        if(root==null){
//            return;
//        }
//        System.out.print(root.data+" ");
//        inorder(root.left);
//        inorder(root.right);
//
//    }
//
//    int findlevel(TNode root,int k){
//        int count=1;TNode tptr=root;
//        while(tptr!=null && tptr.data!=k){
//            count++;
//            if(tptr.data>k){
//                tptr=tptr.left;
//            }
//            else{
//                tptr=tptr.right;
//            }
//        }
//        if(tptr==null){
//            return 0;
//        }
//        else{
//            return count;
//        }
//    }
//    void display(){
//        inorder(root);
//    }
//    void find_siblings(int k){
//        int level=findlevel(root,k);
//        if(level==0||root.data==k){
//            System.out.println("No siblings found");
//            return;
//        }
//        else{
//            if(print_siblings(root,k,level)==false){
//                System.out.println("No siblings found");
//            }
//        }
//    }
//    boolean print_siblings(TNode root,int k,int level){
//        if(root==null){
//            return false;
//        }
//        if(level==1 && root.data!=k){
//            System.out.print(root.data+" ");
//            return true;
//        }
//        boolean left=print_siblings(root.left,k,level-1);
//        boolean right=print_siblings(root.right,k,level-1);
//        return left||right;
//    }
//
//}
//public class levelorderkelements{
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        BS t=new BS();
//        while(true){
//            int n=s.nextInt();
//            if(n==-1){
//                break;
//            }
//            t.create(n);
//        }
//        //t.display();
//        int k=s.nextInt();
//        t.find_siblings(k);
//    }
//}
class TNode{
    int data;
    TNode left,right;
    TNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
class BST{
    TNode root;
    public void create(int data){
        TNode newnode=new TNode(data);
        if(root==null){
            root=newnode;
        }
        else{
            TNode tptr=root,prev=null;
            while(tptr!=null && tptr.data!=data){
                prev=tptr;
                if(tptr.data>data){
                    tptr=tptr.left;
                }
                else{
                    tptr=tptr.right;
                }
            }
            if(prev.data>data){
                prev.left=newnode;
            }
            else{
                prev.right=newnode;

            }

        }
    }
    void inorder(TNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    void display(){
        inorder(root);
    }
    int findlevel(TNode root,int k){
        TNode tptr=root;
        int count=0;
        while (tptr!=null && tptr.data!=k){
            count++;
            if(tptr.data>k){
                tptr=tptr.left;
            }
            else{
                tptr=tptr.right;
            }
        }
        if(tptr==null){
            return 0;
        }
        else{
            return count;
        }
    }
    boolean print_siblings(TNode root,int level,int k){
        if(root==null){
            return false;
        }
        if(level==0 && root.data!=k){
            System.out.print(root.data+" ");
            return true;
        }
        boolean left=print_siblings(root.left,level-1,k);
        boolean right=print_siblings(root.right,level-1,k);
        return left||right;
    }
    void find_siblings(int k){
        int level=findlevel(root,k);
        if(level==0 || root.data==k){
            System.out.println("No siblings found");
            return;
        }
        else{
            if(print_siblings(root,level,k)==false){
                System.out.println("No siblings found");
                return;
            }
        }
    }
}
class levelorderkelements{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BST tree=new BST();
        while(true){
            int input=s.nextInt();
            if(input==-1){
                break;
            }
            tree.create(input);
        }
        int k=s.nextInt();
        //tree.display();
        tree.find_siblings(k);
    }
}