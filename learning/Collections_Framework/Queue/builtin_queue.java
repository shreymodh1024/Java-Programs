import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class builtin_queue {

    static Queue<Integer> q = new LinkedList<>();

    static void add(int val, int idx){// this is it
        for(int i = 0; i<=q.size()-1; i++){

            if(idx==i){
                q.add(val);
            }
            else{ q.add(q.remove());}

        }
    }
    static void remove( int idx){
        for(int i = 0; i<=q.size()-1; i++){
            if(idx==q.size()-1&& i==q.size()-1){q.remove(); break;}
            if(idx==i){
                System.out.println(q.size());
                q.remove();
                System.out.println(q.size());
            }
            q.add(q.remove());

        }
    }
    static int peekFromFirstIn(int idx){
        int a =-1;
        for(int i = 0; i<=q.size()-1; i++){

            if(idx==i){
                a = q.peek();
            }
            q.add(q.remove());

        }
        return a;
    }
    static void traversal(){
        for(int i = 1; i<=q.size(); i++){
            q.add(q.remove());
            System.out.println(q);
        }
    }
    static  Queue<Integer> reverseQueue(){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
       while(!st.isEmpty()){
           q.add(st.pop());
       }
       return q;
    }
    public static void main(String[] args) {

        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        System.out.println(q);
        System.out.println(reverseQueue());



    }

}
