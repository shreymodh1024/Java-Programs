class ListNode{
    private int data; 
     ListNode next;
    ListNode(int data){this.data = data;}//Constructor
    int getData(){return data;}  //these are methods
    void setData(int data){this.data = data;}
    ListNode getNext(){return next;}
    void setNext(ListNode next){this.next = next;}
}

class Linkedlist{
    ListNode head; ListNode tail;
    private  int length = 0; /*length of linked list*/  int getLength(){return length;}
     ListNode getHead(){return head;}

    //inserting node at begining
     void addAtBegin(int data){
       ListNode Node = new ListNode(data);
       if(head==null|| tail ==null){head = tail = Node;}
       Node.next = head;
       head = Node;
       length++;
    }

    //inserting node at end
     void addAtEnd(int data){
       ListNode Node = new ListNode(data);
       if(tail==null){head = tail = Node; return;}
       tail.next = Node;
        tail = Node;
        length++;
    }

    //display linked list
    void display(){System.out.print("[");
        ListNode temp = head;
     while(temp!=null){
        System.out.print(temp.getData()+"  ");
        //temp.setNext(temp.getNext());
       temp = temp.next;
     }System.out.println("]");
    }
    
    // Add a new value to the list at a given position
    void addAt(int idx, int data){
        ListNode Node = new ListNode(data); 
        int i=0;
        for(ListNode temp=head ; temp!=null;temp= temp.next ){
           
            if(idx-1 ==i){
                 Node.next= temp.next;
                temp.next= Node;
               
                 break;
            }
            else i++;
          
        }length++;
    }
    
    // remove at the begining
    void removeAtBegin(){

        ListNode temp = head;
        head = temp.next;
        length--;
    }

    //remove at end
    void removeAtEnd(){
        ListNode temp= head;
       while(temp!=null){
        if(temp.next==tail){temp.next= null; tail = temp;}
        else temp = temp.next;
       }length--;
    }
    
    //remove at any position
    void removeAt(int idx){
        ListNode temp = head;
        for(int i=0; temp!= null; i++){
            if(idx-1==i){temp.next = temp.next.next;}
            else temp = temp.next;
        }length--;
    }

    //clear the list
    void clearList(){
        head = null; length=0;
    }

    //to search if the element exists or not
    boolean searchPresence(int data){
        
        for(ListNode temp =head; temp!=null; temp = temp.next){
            if(temp.getData()==data){return true;} 
           

        }
        return false;
    }

    //get at idx function
    ListNode getNode(int idx){
        ListNode temp = head;
        for(int i=0; temp!= null; i++){
            if(idx ==i){return temp;}
            temp = temp.next;
        }
        return tail;
    }
}

public class singlyLinkedList {

    public static void main(String[] args) {
        // ListNode n1 = new ListNode(11);
        // ListNode n2 = new ListNode(22);
        // ListNode n3 = new ListNode(33);
        // n1.setNext(n2); n2.setNext(n3);

        Linkedlist L1 = new Linkedlist(); 
        // L1.head = n1; L1.tail = n3;
       
        L1.addAtBegin(100);
        L1.addAtEnd(1000);
       
         L1.addAt(2, 105);
         L1.addAt(2, 106);
         L1.display();
        System.out.println("searchpresence: "+L1.searchPresence(107));
        System.out.println("getnode: "+L1.getNode(2).getData());
        //  L1.clearList(); 
        // L1.display();
         
        // L1.display();
        // L1.removeAtBegin(); L1.removeAtEnd(); 
        // L1.display();
        // L1.removeAt(2);
        // L1.display();
       // System.out.println("length of list: "+L1.getLength());
       
        
       
    }
}
