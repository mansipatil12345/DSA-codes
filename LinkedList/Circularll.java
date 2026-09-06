
public class Circularll {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addfirst(int data){
        //create
        Node newnode = new Node(data);
        size++;

        if(head==null){
            head=tail=newnode;
            tail.next=head;
            return;
        }

        newnode.next=head;
        head=newnode;
        tail.next=newnode;
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        size++;

        if(head==null){
            head=tail=newnode;
            tail.next=head;
            return;
        }

        tail.next=newnode;
        tail=newnode;
        tail.next=head;
    }

    
    public void add(int idx,int data){
        Node newnode = new Node(data);
        size++;

        if(idx==0){
            addfirst(data);
            return;
        }

        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }


    //delte in between nodes
    public void delete(int key){
        if(head==null){
            System.out.println("Empty");
            return;
        }

        if(head.data==key){
            removeFirst();
            return;
        }

        Node curr=head.next;
        Node prev=head;

        while(curr!=head){
            if(curr.data==key){
                prev.next=curr.next;
                if(curr==tail){
                    tail=prev;
                }
                size--;
                return;
            } 
            prev=curr;
            curr=curr.next;
        }
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val = head.data;
        head=head.next;
        tail.next=head;
        size--;
        return val;
    
    }

    public int removelast(){
        if(head==null){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = tail.data;
            head=tail=null;
            size--;
            return val;
        }

        Node temp = head;
        while(temp.next!=tail){
            temp=temp.next;
        }

        int val = tail.data;
        tail=temp;
        tail.next= head;
        size--;
        return val;
    }



    public void print(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        // while(temp!=head){                        -> replace it with do - while loop
        //     System.out.println(temp.data+ " -> ");
        //     temp=temp.next;
        // }
        // System.out.println("(back to head)");

        do { 
            System.out.print(temp.data+" -> ");
            temp=temp.next;
            
        } while (temp!=head);
        System.out.println("(back to head)");

         //Key Difference
            // Loop Type	Condition Check
            // while	    Before execution
            // do-while	    After execution  if we used while nothing is printed coz temp==head and in while condition is temp!=head 
                        //this doesnot satify the condition and nothing is printed so we used do while coz first it is printing then checking the condition 
    }


    public static void main(String[] args) {
        Circularll ll = new Circularll();

        ll.addfirst(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);

        ll.print();

        ll.add(2,99);
        ll.print();

        ll.removeFirst();
        ll.print();

        ll.removelast();
        ll.print();

        ll.delete(99);
        ll.print();

    }
}
