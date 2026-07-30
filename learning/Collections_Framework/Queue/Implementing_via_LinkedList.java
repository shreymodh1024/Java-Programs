
public class Main {

   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        Node(){}
    }

   static class MyQueue{
        Node head; Node tail; int size;
        void add(int val){
            Node n = new Node(val); size++;
            if(tail==null){head = tail = n; return;}
            tail.next = n;
            tail = n;

        }
        void display(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+", ");
                temp = temp.next;
            }
            System.out.println();
        }
        int remove(){
            size--;
            Node temp = head;
            head = head.next;
            return temp.data;
        }
        int peek(){

            return head.data;
        }
    }




    public static void main(String[] args) {
        MyQueue q = new MyQueue();
       q.add(10); q.add(20); q.add(30);
       q.display();
       q.remove();
       q.display();
        System.out.println(q.peek()+" "+q.size);
    }
}