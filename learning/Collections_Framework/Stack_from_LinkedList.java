public class Stack_from_LinkedList {

    static class Node{
        int val;
        Node next;
        Node(int val){this.val = val;}
    }
    static class MyStack{
    Node head;
    int len;

        int peek(){
            return head.val;}

        int pop() throws  Exception{
            if(head ==null){throw new Exception("the stack is still empty");}
            len--;
        int x = head.val;
        head = head.next;
        return x;
        }

        void push(int val){

            Node temp = new Node(val); len++;
            if(len==0){head = temp;}
          else{  temp.next = head;
            head = temp;
            }
        }

        void display(){
            Node temp2 = head;
            while(temp2 !=null){
                System.out.println(temp2.val);
                temp2 = temp2.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
    MyStack st = new MyStack();
    st.push(10); st.push(20); st.push(30); st.push(40);
    st.display();
        System.out.println(st.len);
        System.out.println(st.peek());
        st.pop();
        st.display();
    }
}
