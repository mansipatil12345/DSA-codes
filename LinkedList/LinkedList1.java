
// public class LinkedList1 {

//     public static class Node {

//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) { //O(1)
//         Node newnode = new Node(data);
//         size++;

//         if (head == null) {
//             head = tail = newnode;
//             return;
//         }
//         newnode.next = head;
//         head = newnode;
//     }

//     public void addLast(int data) { //O(1)
//         Node newnode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newnode;
//             return;
//         }
//         tail.next = newnode;
//         tail = newnode;
//     }

//     public void add(int index, int data) { //O(1)    
//         if (index == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newnode = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;
//         while (i < index - 1) {
//             temp = temp.next;
//             i++;
//         }
//         newnode.next = temp.next;
//         temp.next = newnode;
//     }

//     public void printLinkedList() {  //O(n)
//         if (head == null) {
//             System.out.print("Linked List is empty");
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public int removeFirst() {
//         if (size == 0) {
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         } else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }

//     public int removeLast() {
//         if (size == 0) {
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         } else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         //prev= i=size-2
//         Node prev = head;
//         for (int i = 0; i < size - 2; i++) {
//             prev = prev.next;
//         }
//         int val = prev.next.data; //tail ka data
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;
//     }

//     public int itrsearch(int key) { //linear search approach1 //O(n)
//         Node temp = head;
//         int i = 0;

//         while (temp != null) { //key found
//             if (temp.data == key) {
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         return -1; //key not found
//     }

//     public int helper(Node head, int key) { //O(n),o(n) t.c.and s.c due to stack
//         if (head == null) {
//             return -1;
//         }
//         if (head.data == key) {
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if (idx == -1) {
//             return -1;
//         }
//         return idx + 1;
//     }

//     public int recSearch(int key) {
//         return helper(head, key);
//     }

//     public void reverse() {
//         Node prev = head;
//         Node curr = tail = head;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//     }

//     public void deleteNthNodefromEnd(int n){ //O(n)->T.C
//         //caclculate size
//         int sz=0;
//         Node temp=head;
//         while(temp!=null){
//             temp=temp.next;
//             sz++;
//         }

//         if(n==sz){
//             head=head.next; //remove first
//             return;
//         }

//         //sz-n
//         Node prev=head;
//         int i=1;
//         int iToFind = sz-n;
//         while(i<iToFind){
//             prev=prev.next;
//             i++;
//         }
//         prev.next=prev.next.next;
//     }

//     //step1 : slow fast approach to find Mid Node 
//     public Node findMid(Node head){
//         Node slow=head;
//         Node fast=head;

//         //covering both cases even and odd no of nodes
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;   //+1
//             fast=fast.next.next;  //+2
//         }
//         return slow;
//     }

//     //step2 : reverse
//     public boolean checkPalindrome(){
//         //base case
//         if(head==null || head.next==null){
//             return true;
//         }
//         //step1: find mid
//         Node midNode=findMid(head);

//         //step2:reverse 2nd half
//         Node prev=null;
//         Node curr=midNode;
//         Node next;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         //step3:check left helf and right half
//         Node right=prev;
//         Node left= head;

//         while(right!=null){
//             if(left.data!=right.data){
//                 return false;
//             }
//             left=left.next;
//             right=right.next;
//         }
//         return true;
//     }

//     public static boolean isCycle(){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next; //+1
//             fast=fast.next.next; //+2
//             if(slow==fast){
//                 return true; //cycle exists
//             }
//         }
//         return false; //cycle doesn't exist
//     }

//     public static void removeCycle(){
//         //detecting cycle
//         Node slow=head;
//         Node fast=head;
//         boolean cycle=false;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast){
//                 cycle=true;
//                 break;
//             }
//         }
//         if(cycle==false){
//             return;
//         }
//         //find meeting point
//         slow=head;
//         Node prev=null;
//         while(slow!=fast){
//             prev=fast;
//             slow=slow.next; //+1
//             fast=fast.next; //+1
//         }
//         //removing the cycle
//         prev.next=null; //last node;
//     }

//     private Node getMid(Node head){
//         Node slow=head;
//         Node fast= head.next;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }

//     private Node merge(Node head1,Node head2){
//         Node mergedLL=new Node(-1);
//         Node temp=mergedLL;

//         while(head1!=null && head2 !=null){
//             if(head1.data<=head2.data){
//                 temp.next=head1;
//                 head1=head1.next;
//                 temp=temp.next;
//             }
//             else{
//                 temp.next=head2;
//                 head2=head2.next;
//                 temp=temp.next;
//             }
//         }

//         while(head1!=null){
//             temp.next=head1;
//             head1=head1.next;
//             temp=temp.next;
//         }

//         while(head2!=null){
//             temp.next=head2;
//             head2=head2.next;
//             temp=temp.next;
//         }
//         return mergedLL.next;
//     }

//     public Node mergeSort(Node head){
//         //ll is empty or contain single node 
//         if(head==null || head.next==null){
//             return head;
//         }
//         //find mid
//         Node mid=getMid(head);

//         //left & right half
//         Node righthead=mid.next;
//         mid.next=null;
//         Node newleft =mergeSort(head);
//         Node newright= mergeSort(righthead);

//         //merge
//         return merge(newleft,newright);
//     }


//     public static void main(String[] args) {
//         LinkedList1 ll = new LinkedList1();
//         // ll.addLast(1);
//         // ll.addLast(2);
//         // ll.addLast(2);
//         // ll.addLast(1);
//         // // ll.add(3, 4);
//         // ll.printLinkedList();
//         // // System.out.println(ll.size);

//         // // ll.removeLast();
//         // // ll.printLinkedList();
//         // // ll.removeFirst();
//         // // ll.printLinkedList();
//         // // System.out.println(ll.size);
//         // // System.out.print(ll.itrsearch(2));
//         // // System.out.println(ll.recSearch(10));
//         // // ll.printLinkedList();
//         // // ll.deleteNthNodefromEnd(3);
//         // // ll.printLinkedList();

//         // System.out.println(ll.checkPalindrome());
        
//         // head=new Node(1);
//         // Node temp=new Node(2);
//         // head.next=temp;
//         // head.next.next=new Node(3);
//         // head.next.next.next=temp;
//         // //1->2->3->2
//         // System.out.println(isCycle());
//         // removeCycle();
//         // System.out.println(isCycle());

//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         // ll.addFirst(5);
//         //5->4->3->2->1
//         ll.printLinkedList();
//         ll.head=ll.mergeSort(ll.head);
//         ll.printLinkedList();
//     }
// }

