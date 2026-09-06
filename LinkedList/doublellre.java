public class doublellre {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data= data;
            this.next= null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add
    //addfirst               t.c O(1)
    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }

        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    //addlast               t.c O(1)
    public void addlast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }

    //print             t.c O(n)
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    //remove
    //remove first                  t.c O(1)
    public int removeFirst(){
        if(head==null){
            System.out.println("Dll is empty");
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
        head.prev=null;
        size--;
        return val;
    }
    //remove last          O(1)

    public int removeLast(){
        if(head==null){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val = tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    public void reverse(){    //O(n)
        Node curr = head;  
        Node prev = null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev = next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        doublellre dll = new doublellre();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.print();
        // System.out.println(dll.size);

        // // dll.removeFirst();
        // // dll.print();
        // // System.out.println(dll.size);

        // dll.removeLast();
        // dll.print();
        // System.out.println(dll.size);

        dll.reverse();


    }
}
