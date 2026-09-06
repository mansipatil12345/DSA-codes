// import java.util.PriorityQueue;

// public class WeakestSolider {
//     static class Row implements Comparable<Row>{
//         int soldiers;
//         int idx;

//         public Row(int soldiers,int idx){
//             this.soldiers = soldiers;
//             this.idx= idx;
//         }

//         @Override
//         public int compareTo(Row r2){
//             if(this.soldiers == r2.soldiers){
//                 return this.idx - r2.idx;
//             }
//             return this.soldiers-r2.soldiers;
//         }
//     }

//     public static void main(String[] args) {
//         int army[][] = {{1,0,0,0},
//                         {1,1,1,1},
//                         {1,0,0,0},
//                         {1,0,0,0}};

//         int k = 2;
//         PriorityQueue<Row> pq = new PriorityQueue<>();  //s.c is O(n) -> coz of priority queue
//         for(int i=0;i<army.length;i++){          //t.c -> O(n*m)+O(nlogn)-> add n rows(n*logn)
//             int count =0;
//             for(int j=0;j<army[0].length;j++){   
//                 count += army[i][j] == 1? 1:0;
//             }
//             pq.add(new Row(count, i));
//         }

//         for(int i=0;i<k;i++){                   //t.c -> O(k*logn)-> remove it is O(logn)  total -> O(nm + (n+k)logn) if k<=n -> O(nm + nlogn) 
//             System.out.println("R"+pq.remove().idx);
//         }
//     }
// }


