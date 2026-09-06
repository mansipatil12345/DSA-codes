// import java.util.*;
// public class Cycle {
//     static class Edge{
//         int src;
//         int dest;
//         // int weight;
//         public Edge(int s,int d){
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     static void CreateGraph(ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]= new ArrayList<>();
//         }

//         // graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));

//         // graph[2].add(new Edge(2, 1));
//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 0));
//         graph[4].add(new Edge(4, 2));
//     }

//     public static boolean detectCycle(ArrayList<Edge> graph[]){
//         boolean vis[]= new boolean[graph.length];

//         for(int i=0;i<graph.length;i++){
//             if(!vis[i]){
//                 if(detectCycleUtil(graph,vis,i,-1)){//start ka par = -1 
//                     return true;//cycle agar one of the component me hua toh
//                 } 
//             }
//         }
//         return false;
//     }

//     public static boolean detectCycleUtil(ArrayList<Edge> graph[],boolean vis[],int curr,int par){ //O(V+E) -> in undirected graph
//         vis[curr]=true;

//         for(int i=0;i<graph[curr].size();i++){
//             Edge e = graph[curr].get(i);
//             //case 3 -> vis nahi hai 
//             if(!vis[e.dest]){
//                 if( detectCycleUtil(graph, vis, e.dest, par)){ //saath me isliye nahi likha coz isse vis true ho jayega and next case toh always true dega 
//                     //so use nested if only 
//                     return true;
//                 }   
//             }
//             //case 1 -> vis hai but par nahi hai -> always a cycle
//             else if(vis[e.dest] && e.dest !=par){
//                 return true; 
//             }//oover true cases
//         }
//         return false;//(case 2 vis but parent hai -> continue)
//     }
//     public static void main(String args[]){
//         int V = 5;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         CreateGraph(graph);
//         System.out.println(detectCycle(graph));
//     }
    
// }
