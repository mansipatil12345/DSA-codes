// public class revision{
//     public static void printSolution(int sol[][]){
//         for(int i=0;i<sol.length;i++){
//             for(int j=0;j<sol.length;j++){
//                 System.out.print(sol[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static boolean valid(int maze[][],int x,int y){
//         return (x>=0 && x<maze.length)&&(y>=0 && y<maze.length)&&(maze[x][y]==1);
//     }

//     public static boolean solveMazeUtil(int maze[][],int sol[][],int x,int y){
//         //base case
//         if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
//             sol[x][y]=1;
//             return true;
//         }

//         //recursion
//         if(valid(maze,x,y)==true){
//             if(sol[x][y]==1){
//                 return false;
//             }
//             sol[x][y]=1;

//             if(solveMazeUtil(maze, sol, x+1, y)){
//                 return true; //down
//             }
//             if(solveMazeUtil(maze, sol, x, y+1)){
//                 return true; //right 
//             }
//             sol[x][y]=0;
//             return false;
//         }
//         return false;
//     }
//     public static boolean solveMaze(int maze[][]){
//         int N = maze.length;
//         int sol[][]=new int[N][N];

//         if(solveMazeUtil(maze, sol,0,0)==false){
//             System.out.println("Solution exists");
//             return false;
//         }
//         printSolution(sol);
//         return true;
//     }
//     public static void main(String args[]){
//         int maze[][]={{1,0,0,0},
//                       {1,1,0,1},
//                       {0,1,0,0},
//                       {1,1,1,1}};
//         solveMaze(maze);
//     }
// }


// public class revision{
//     public static void keycombinations(String digits,String combinations[],int idx,String curr){

//         if(digits.length()==0){
//             System.out.println("null");
//             return;
//         }
//         if(idx==digits.length()){
//             System.out.println(curr);
//             return;
//         }

//         String letters=combinations[digits.charAt(idx)-'0'];
//         for(int i=0;i<letters.length();i++){
//             keycombinations(digits, combinations, idx+1, curr+letters.charAt(i));
//         }

//     }
//     public static void main(String[] args) {
//         String digits="23";
//         String combinations[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//         String curr="";
//         keycombinations(digits, combinations, 0, curr);

//     }
// }


// public class revision{

//     public static void printSolution(int sol[][]){
//         for(int i=0;i<sol.length;i++){
//             for(int j=0;j<sol.length;j++){
//                 System.out.print(sol[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static boolean isSafe(int x,int y,int sol[][],int n){
//         return (x>=0 &&x<n && y>=0 && y<n && sol[x][y]==-1);   
//     }

//     public static boolean Knightstour(int x,int y,int expval,int sol[][],int xmove[],int ymove[],int n){
//         if(expval==(n*n)-1){
//             return true;
//         }

//         for(int i=0;i<8;i++){
//             int next_x=x+xmove[i];
//             int next_y=y+ymove[i];

//             if(isSafe(next_x,next_y,sol,n)){
//                 sol[next_x][next_y]=expval;

//                 if(Knightstour(next_x, next_y, expval+1, sol, xmove, ymove, n)){
//                     return true;
//                 }else{
//                     sol[next_x][next_y]=-1;  //if it doesnot lead to a solution
//                 }
//             }

//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int n=8;
//         int sol[][]=new int [n][n];

//         for(int i=0;i<n;i++){               //initalize with -1 denoted as univisted cells
//             for(int j=0;j<n;j++){
//                 sol[i][j]=-1;
//             }
//         }

//         int xmove[]={-2,-1,1,2,2,1,-1,-2};
//         int ymove[]={1,2,2,1,-1,-2,-2,-1};
//         sol[0][0]=0;
//         if(Knightstour(0, 0, 1, sol, xmove, ymove, n)){
//             System.out.println("Solution exists");
//             printSolution(sol);
//         }
//         else{
//             System.out.println("Solution does not exist");
//         }
//     }
// }



