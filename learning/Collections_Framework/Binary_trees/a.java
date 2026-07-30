//BINARY TREE PRIMARY FEATURES first lecture
class Node{
    int val;
    Node right;
    Node left;
    Node(int val){this.val = val;}
}

public class main2 {
    static int levelsOf(Node root){
        return (root==null)?0: 1+Math.max(levelsOf(root.left),levelsOf(root.right));
    }
    static void display(Node root){
         if(root == null) return;
        System.out.print(root.val+" ");
        display(root.right);
        display(root.left);
    }
    static int size(Node root){

        return (root==null)?0 : 1+size(root.left)+size(root.right);
    }
    static int sum(Node root){

        return (root==null)?0: root.val+ sum(root.right)+sum(root.left);
    }
    static int product(Node root){
        return (root==null||root.val==0)?1: root.val * product(root.right) * product(root.left);
    }
    static int max(Node root){
        if(root == null){return Integer.MIN_VALUE;}
        int r = max(root.right), l = max(root.left);
        return Math.max(root.val, Math.max(r,l));
    }
    static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    public static void main(String[] args) {
        Node  a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left=d; b.right= e;
        c.left= f; c.right = g;
        display(a);
        System.out.println("\n"+size(a));
        System.out.println("sum: "+sum(a));
        System.out.println("product: "+product(a));
        System.out.println("max: "+max(a));
        System.out.println("levels: "+levelsOf(a));
         preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
    }
}
