import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//BINARY TREE PRIMARY FEATURES 2nd part
class Node{
    int val;
    Node right;
    Node left;
    Node(int val){this.val = val;}
}
class pair{
    Node node;
    int level;
    pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}

public class main2 {
    static int levelsOf(Node root){

        return (root==null)?0: 1+Math.max(levelsOf(root.left),levelsOf(root.right));
    }
    static void preorderIterative(Node root){

        Stack<Node> st = new Stack<>();
        st.add(root);
        while(!st.isEmpty()){
            Node temp = st.pop();
            System.out.print(temp.val+" ");
            if(temp.right!= null) st.push(temp.right);
            if(temp.left != null) st.push(temp.left);

        }
        System.out.println();
    }
    static void levelOrder(Node root){

        //breadth first search
    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()){
       Node temp = q.remove();
        System.out.print(temp.val+" ");
       if(temp.left!= null) q.add(temp.left);
       if(temp.right!= null) q.add(temp.right);

    }
        System.out.println();
    }
    static void levelOrderLineWise(Node root){

        Queue<pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new pair(root, 0));


        while(!q.isEmpty()){
            pair temp = q.remove();

            if(temp.level != currLevel){
                System.out.println();
                currLevel++;
            }
            System.out.print(temp.node.val+" ");
            if(temp.node.left != null) q.add(new pair(temp.node.left, currLevel+1));
            if(temp.node.right != null) q.add(new pair(temp.node.right, currLevel+1));

        }
        System.out.println();
    }
    static void kthLevel(Node root,int level, int k){

        if(root == null){return;}
        if(level == k) System.out.print(root.val+" ");
        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }





    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left = b; a.right = c;
        b.left=d; b.right= e;
        c.left= f; c.right = g;
        g.right = h;
         for(int i =1; i <= levelsOf(a); i++){
             kthLevel(a, 1, i);
             System.out.println();
        }

    }
}