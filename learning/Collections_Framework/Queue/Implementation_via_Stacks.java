import java.util.Stack;

//Implementation via Stacks
public class main3 {


    static class Queues{
         Stack<Integer> st1 = new Stack<>();
         Stack<Integer> st2 = new Stack<>();
        int size;
        void add(int val){
            st1.push(val); size++;
        }
        int remove(){
            while(!st1.isEmpty()){st2.push(st1.pop());}
           int a = st2.pop(); size--;
            while(!st2.isEmpty()){st1.push(st2.pop());}
            return a;
        }
        int peek(){
            while(!st1.isEmpty()){st2.push(st1.pop());}
            int a = st2.peek();
            while(!st2.isEmpty()){st1.push(st2.pop());}
            return a;
        }
        void display(){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            while(!st2.isEmpty()){
                System.out.print(st2.peek()+", ");
                st1.push(st2.pop());
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queues q = new Queues();

        q.add(10); q.add(20); q.add(30); q.add(40);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek()+" " +q.size);

    }
}