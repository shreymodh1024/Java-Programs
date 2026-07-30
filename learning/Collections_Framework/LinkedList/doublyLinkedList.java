public class Main {


    //creating a node
   static  class DLLNode{
        DLLNode prev;
        DLLNode next;
        int data;
        DLLNode(int data){//constructor 1
            this.data = data;
        }
        DLLNode(int data, DLLNode prev, DLLNode next){// constructor 2
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    //creating a linked list
    static class Linkedlist{
       DLLNode head;
       DLLNode tail;
       void addAtBegin(int val){
           DLLNode n = new DLLNode(val);
           if(head== null){
               head = tail = n;
           }
           else{
               n.next = head;
               head.prev = n;
               head = n;
           }

       }

       void addAtEnd(int val){

           if(tail==null){
               addAtBegin(val);
           }
           else{
               DLLNode n = new DLLNode(val);
               tail.next = n;
               n.prev = tail;
               tail = n;
           }
       }

       void addAtIdx(int idx, int val){
           if(idx ==0){addAtBegin(val); return;}

           DLLNode n = new DLLNode(val);

           DLLNode temp = head;
           for(int i= 0; i<idx-1;i++){
               temp = temp.next;
           }
           if(temp==tail){addAtEnd(val); return;}
           n.next = temp.next;  temp.next.prev= n;
           temp.next =n; n.prev = temp;

       }

       void display(){
           DLLNode temp = head;
           while(temp!= null){
               System.out.print(temp.data+" ");
               temp= temp.next;
           }
           System.out.println();
       }

       void deleteAtFirst(){
           if(head ==null||head.next== null){
               System.out.println("list does not exist"); return;}
           head = head.next;
           head.prev= null;

       }

       void deleteAtLast(){
           if(tail==null|| tail.prev == null){
               System.out.println("list does not exist"); return;
           }
           tail = tail.prev;
           tail.next =null;

       }

       void deleteAtIdx(int idx){
           DLLNode temp = head;
           for(int i = 0; i<idx-1; i++){
               temp = temp.next;
           }
           temp.next = temp.next.next;
           temp.next.prev= temp;
       }
    }

    public static void main(String[] args) {
        Linkedlist L1 = new Linkedlist();

        //add at begin testing
        L1.addAtBegin(5); L1.addAtBegin(6); L1.addAtBegin(7);
       L1.display();

        //add at end testing
        L1.addAtEnd(8);
        L1.display();

        //add at idx testing
        L1.addAtIdx(0,100);
        L1.display();

        //delete at idx testing
        L1.deleteAtIdx(3);
        L1.display();

        //delete at first testing
        L1.deleteAtFirst();
        L1.display();

        //delete at last testing
        L1.deleteAtLast();
        L1.display();


    }
}