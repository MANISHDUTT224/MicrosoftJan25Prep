import java.util.HashMap;
import java.util.Map;

class Node{
    int key,value;
    Node next,prev;
    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}
public class implementlrucache_leet146 {
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    static int capacity;
    Map<Integer,Node> mp=new HashMap<>();
    public implementlrucache_leet146(int cap){
        capacity=cap;
        head.next=tail;
        tail.prev=head;

    }
    public void addnode(Node newnode){
        Node temp=head.next;
        newnode.next=temp;
        temp.prev=newnode;
        head.next=newnode;
        newnode.prev=head;
    }
    public void deletenode(Node delnode){
        Node delprev=delnode.prev;
        Node delnext=delnode.next;
        delprev.next=delnext;
        delnext.prev=delprev;
    }
    public int get(int key){
        if(mp.containsKey(key)){
            Node resnode=mp.get(key);
            int res=resnode.value;
            mp.put(key,resnode);
            deletenode(resnode);
            addnode(resnode);
            mp.put(key,head.next);
            System.out.println(res);
            return res;
        }
        System.out.println(-1);
        return -1;
    }
    public void put(int key,int value){
        if(mp.containsKey(key)){
            Node existingnode=mp.get(key);
            mp.remove(key);
            deletenode(existingnode);
        }
        if(mp.size()==capacity){
            mp.remove(tail.prev.key);
            deletenode(tail.prev);
        }
        addnode(new Node(key,value));
        mp.put(key,head.next);
    }
    public static void main(String[] args) {
        implementlrucache_leet146 LRU=new implementlrucache_leet146(2);
        LRU.put(1,0);
        LRU.put(2,2);
        LRU.get(1);
        LRU.put(3,3);
        LRU.get(2);
        LRU.put(4,4);
        LRU.get(1);
        LRU.get(3);
        LRU.get(4);
    }
}
/*
["LRUCache","put","put","get","put","get","put","get","get","get"]
[[2],[1,0],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]//Ignore the clasname and this ridiculuous test case input format lol
Output:
[null,null,null,0,null,-1,null,-1,3,4]

 */
