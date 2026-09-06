// public class LinkedList2{
//     public static class Node{ //by using static keyword u directly call Node n = new Node(10) directly mke the object
//         int data;
//         Node next; //storing another node object

//         public Node(int data){
//             this.data=data;
//             this.next = null;
//         }
//     }
//     public static Node head; //starting point of list
//     public static Node tail; //end point of list 
//     public static int size;//size of the list  O(1)

//     //methods to do all operations instad of doing in main function
//     public void addFirst(int data){    //-> single operation no loop and recusion is performed constant work is done 
//                                     // -> t.c is O(1)
//         //create a new Node
//         Node newnode = new Node(data);
//         size++;

//         if(head == null){
//             head=tail=newnode;
//             return;
//         }

//         //new node-> next = head
//         newnode.next=head;

//         //head = newnode
//         head = newnode;
//     }

//     public static void addLast(int data){ //constant time op O(1)
//         //create a new node
//         Node newnode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newnode;
//             return;
//         }
//         //tail.next -> newnode
//         tail.next=newnode;

//         //tail->newnode
//         tail=newnode;

//     }

//     //print linked list
//     public void print(){//  t.c -> O(n)
//         if(head==null){
//             System.out.println("null");
//             return;
//         }
//         Node temp = head;
//         while(temp!=null){ //jab tak while null nahi hota
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");//last me null
//     }

//     public void add(int idx,int data){  //t.c ->O(n) 
//         if(idx==0){ 
//             addFirst(data); //yaha nahi likhenge coz already addfirst me likha hua hai 
//         }
//         Node newnode = new Node(data);
//         size++;

//         Node temp=head;
//         int i=0;
//         while(i<idx-1){
//             temp = temp.next;
//             i++;
//         }
//         newnode.next = temp.next;
//         temp.next=newnode;
//     }

//     public int removeFirst(){ //O(1)
//         if(size==0){
//             System.out.print("LL is empty");
//             return Integer.MIN_VALUE;
//         }else if(size==1){
//             int val = head.data;
//             head=tail=null;
//             size=0;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }

//     public int removeLast(){ //O(n)-> traversing to last
//         if(size==0){
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         }else if(size==1){
//             int val = head.data;
//             head = tail=null;
//             size=0;
//             return val;
//         }

//         //prve i= size-2 -> last ko remove karna hai toh second last tak pochna hoga
//         Node prev = head;
//         for(int i=0;i<size-2;i++){
//             prev=prev.next;
//         }
//         int val = prev.next.data;
//         prev.next=null;
//         tail=prev;
//         size--;
//         return val;
//     }

//     public int itrsearch(int key){  //O(n)-> without recursion
//         Node temp = head; 
//         int i=0;
//         while(temp!=null){
//             //key found
//             if(temp.data==key){
//                 return i;
//             }

//             temp=temp.next;
//             i++;
//         }
//         //key not found
//         return -1;
//     }

//     public int helper(Node head,int key){//O(n)-> t.c and O(n)-> s.c due to call stack 
//         if(head==null){
//             return -1;
//         }

//         if(head.data==key){
//             return 0;
//         }

//         int idx = helper(head.next,key);
//         if(idx==-1){
//             return -1;
//         }
//         return idx+1;
//     }
//                                 //we made a helper function coz head keeps changing so by making a function and passing 
//                                 //head over there keeps the orignal value of head safe otherwise using recsearch only will
//                                 //create infinite loop as head will point to org val only wont change
//     //with recursion
//     public int recsearch(int key){
//         return helper(head,key);
//     }


//     //reverse
//     public void reverse(){   //O(n) -> 3 var 4 steps
//         Node prev = null;
//         Node curr = tail = head;
//         Node next;
//         while(curr!=null){
//             next = curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head = prev;
//     }


//     //find and remove Nth node From end
//     //iterative app
//     public void deleteNthfromEnd(int n){
//         //calculate size
//         int size=0;
//         Node temp = head;
//         while(temp!=null){ //O(n)
//             temp=temp.next;
//             size++;
//         }

//         if(n==size){
//             head = head.next;
//             return; 
//         }

//         //size-n
//         int i=1;
//         int iTofind=size-n;  //O(n)->worst case total = O(n)+O(n)=O(2n)
//         Node prev = head;
//         while(i<iTofind){
//             prev = prev.next;
//             i++;
//         }

//         prev.next=prev.next.next;
//         return;
//     }
    

//     //palindrome-> slow fast concept , reverse half ll  t.c O(n)
//     // eg 1-2-2-1

//     //slow - Fast approach
//     public Node findMid(Node head){          //O(n)
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next !=null){
//             slow=slow.next;    //+1
//             fast=fast.next.next; //+2
//         }

//         return slow; //slow is my midNode
//     }
        
//     public boolean checkpalindrome(){             
//         if(head==null || head.next ==null){ //if thereis no node or only one node 
//             return true;
//         }
//         //step1 -find mid
//         Node midnode= findMid(head);

//         //step2 -reverse 2nd half          //O(n)
//         Node prev=null;
//         Node curr= midnode;
//         Node next;

//         while(curr!=null){
//             next = curr.next;
//             curr.next =prev;
//             prev=curr;
//             curr=next;
//         }

//         Node right = prev; //right half ka head
//         Node left = head; //left half ka head
//         //step3- check left and right half
//         while(right!=null){                   //O(n)
//             if(left.data!=right.data){
//                 return false;
//             }
//             left=left.next;
//             right=right.next;
//         }
//         return true;
//     }                                        //total O(n)+O(n)+O(n)=O(3n)=O(n)

//     public static boolean isCycle(){      //floyds cycle finding algo
//                                             //t.c->O(n)
//         Node slow=head;
//         Node fast = head;
//         while(fast!=null && fast.next !=null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void removecycle(){    //will work for half cycles only not full like last node 
//                                         //is connected to somewhere after head not with head eg 1->2->3->4->2
//         //detect cycle
//         Node slow= head;
//         Node fast = head;
//         boolean cycle = false;
//         while(fast!=null && fast.next!=null){   //O(n)
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

//         //find meeting point     //O(n)
//         slow = head;
//         Node prev = null;
//         while(slow!=fast){
//             prev=fast;
//             slow=slow.next;
//             fast=fast.next;
//         }
//         //remove cycle -> last.next =null
//         prev.next = null;    //O(1)  total -> O(n)+O(n)+O(1)=O(2n)=O(n)
//     }


//     private Node getMid(Node head){
//         Node slow = head;
//         Node fast = head.next;

//         while(fast !=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }


//     private Node merge(Node head1,Node head2){
//         Node mergedLL = new Node(-1);
//         Node temp = mergedLL;

//         while(head1 !=null && head2 !=null){
//             if(head1.data <=head2.data){
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp=temp.next;
//             }else{
//                 temp.next = head2;
//                 head2=head2.next;
//                 temp = temp.next;
//             }
//         }

//         while(head1!=null){
//             temp.next = head1;
//             head1= head1.next;
//             temp = temp.next;
//         }

//         while(head2!=null){
//             temp.next = head2;
//             head2=head2.next;
//             temp = temp.next;
//         }
//         return mergedLL.next;

//     }
//     public Node mergeSort(Node head){  //t.c O(nlogn)
//         if(head==null || head.next ==null){ //koi bhi ek conditin satisfy ho 
//             return head;
//         }
//         //find mid
//         Node mid = getMid(head);
//         //left & right MS
//         Node righthead = mid.next;
//         mid.next =null;
//         Node newleft = mergeSort(head);
//         Node newRight = mergeSort(righthead);
//         //merge
//         return merge(newleft,newRight);
//     }


//     //zigzag   -> t.c O(n)  s.c O(1)

//     public void zigzag(){
//         //find Mid
//         Node slow = head;           //O(n)
//         Node fast = head.next;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         //reverse-2nd half
//         Node mid =slow;


//         Node curr=mid.next;
//         mid.next=null;
//         Node prev=null;
//         Node next;

//         while(curr!=null){          //O(n/2) ~ O(n)
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }


//         Node left=head;
//         Node right= prev;
//         Node nextL,nextR;
//         //zigzag code-alternate merging 
//         while(left!=null && right!=null){      //O(n)  total=O(3n)=O(n)
//             nextL=left.next;          
//             left.next=right;
//             nextR=right.next;
//             right.next=nextL;

//             left = nextL;
//             right=nextR;
//         }

//     }

//     public static void main(String args[]){
//         //  LinkedList2 ll = new  LinkedList2(); //className name of LL = new  className();
//         // // ll.print();
//         // ll.addFirst(2);
//         // ll.addFirst(1);
//         // ll.addLast(2);
//         // ll.addLast(1);
//         // // ll.add(2,3);
//         // ll.print();  //1->2->3->4->5
//         // System.out.println(ll.size);


//         // ll.removeFirst();
//         // ll.print();

//         // ll.removeLast();
//         // ll.print();


//         // System.out.println(ll.itrsearch(5));
//         // System.out.print(ll.itrsearch(10));


//         // System.out.println(ll.recsearch(5));
//         // System.out.print(ll.recsearch(10));

//         // ll.deleteNthfromEnd(3);
//         // ll.print();
//         // System.out.println(ll.checkpalindrome());

//         // head = new Node(1);
//         // Node temp = new Node(2);
//         // head.next = temp;
//         // head.next.next = new Node(3);
//         // head.next.next.next = temp;
//         // //1->2->3->2
//         // System.out.println(isCycle());
//         // removecycle();
//         // System.out.println(isCycle());


//         // LinkedList2 ll = new LinkedList2();
//         // ll.addFirst(1);
//         // ll.addFirst(2);
//         // ll.addFirst(3);
//         // ll.addFirst(4);
//         // ll.addFirst(5); //5->4->3->2->1

//         // ll.print();
//         // ll.head=ll.mergeSort(ll.head); //why did we write ll.head not head ??
//         // ll.print();



//         LinkedList2 ll = new LinkedList2();
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.addLast(5);
//         //1->2->3->4->5

//         ll.print();
//         ll.zigzag();
//         ll.print();

//     }
// }
// //always remember a A static method can only directly access static variables/methods
// //static means static means something belongs to the class, not to an object
// //A static method is a method that belongs to the class, not to any object.