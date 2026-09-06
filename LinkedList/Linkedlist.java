
public class Linkedlist {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add -> method 
    public void addFirst(int data) {
        //step1=create new node 
        Node newnode = new Node(data);
        size++;

        //if linked list is empty 
        if (head == null) {
            head = tail = newnode;
            return;
        }

        //step2=newnode.next=head
        newnode.next = head;

        //step3=head=newnode
        head = newnode;
    }

    public void addLast(int data) {
        //step1=create new node
        Node newnode = new Node(data);
        size++;
        //if linked list is empty 
        if (head == null) {
            head = tail = newnode;
            return;
        }
        //step2=tail.next=newnode
        tail.next = newnode;

        //step3=tail=newnode
        tail = newnode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev:i=n-2; or size-2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrsearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) { //key found
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; //key not found
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;  //for single node at starting 
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return;
        }
        
    }


    public static void main(String args[]) {
        Linkedlist ll = new Linkedlist();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        ll.print();
        ll.reverse();
        ll.print();


        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.recsearch(4));
        // System.out.println(ll.recsearch(10));
        // System.out.print(ll.size);

    }
}
