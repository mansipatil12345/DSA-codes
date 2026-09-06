// import java.util.*;
// public class QueueusingtwoStacks {
//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         //isEmpty()
//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }

//         //add->O(n)
//         public static void add(int data){ //here this function have two while loop in same function
//             while(!s1.isEmpty()){ //O(n)
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while(!s2.isEmpty()){//O(n) total = O(n)+O(n)=O(2n)=O(n)
//                 s1.push(s2.pop());
//             }
//         }

//         //remove -> O(1)
//         public static int remove(){  
//             if(isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }

//             return s1.pop();
//         }

//         //peek -> O(1)
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }

//             return s1.peek();
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


