// import java.util.*;
// public class NearestCar{
//     static class Point implements Comparable<Point>{
//         int x;
//         int y;
//         int distSq;
//         int idx;

//         public Point(int x,int y,int distSq,int idx){
//             this.x = x;
//             this.y = y;
//             this.distSq= distSq;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Point p2){
//             return this.distSq - p2.distSq;
//         }
        
//     }
//     public static void main(String[] args) {
//         int pts[][]={{3,3},{5,-1},{-2,4}};
//         int k = 2;

//         PriorityQueue<Point> pq = new PriorityQueue<>(); -> t.c - O(nlogn) add(logn) and for n ele total is O(nlogn)
//         for(int i=0;i<pts.length;i++){
//             int distSq = pts[i][0]*pts[i][0] + pts[i][1]+pts[i][1];
//             pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
//         }

//         for(int i=0;i<k;i++){  //will print till k like k = 2 so pq wil give 2 min element like elment with min dis on priority
//             System.out.println("C"+pq.remove().idx); -> remove O(logn)*k -> in worst case if k = n so t.c is O(nlogn) 
                                                    //so total t.c is O(nlogn) ans space is O(n) as pq is used 
//         }
//     }
// }

