
// import java.util.PriorityQueue;

// public class ConnectNRopes {
//     public static void main(String[] args) {
//         int ropes[]={4,3,2,6};

//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i=0;i<ropes.length;i++){ -> for add(log n) in pq so for adding n ropes it would be O(nlogn)
//             pq.add(ropes[i]);
//         }

//         int cost =0;
//         while(pq.size()>1){  for while everytime 2 ropes are removed 1 is  put back so n(no of ropes) is decreased in every iteration so it runs n-1 times 
//                          //pehele 5 ropes then ropes decreased by 1 so it runs for 4 times hence at every iteration it rune n-1 times
                            
//             int min2 = pq.remove(); //remove->O(logn)
//             cost += min+min2;  //remove->O(logn)
//             pq.add(min+min2);  //add-> O(logn) total -> O(nlogn)
//         }

//         System.out.println("Cost of connecting n ropes: "+ cost); total 'for' + 'while' t.c -> O(nlogn)+O(nlogn) = 2*..-> removing constant 
                                                                    //final t.c -> O(nlogn) , s.c is O(n) (extra/auxiliary one for pq)
//     }
    
// }



