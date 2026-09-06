// public class Assignment {
//     public static void printSolution(int sol[][]) {
//         for (int i = 0; i < sol.length; i++) {
//             for (int j = 0; j < sol.length; j++) {
//                 System.out.print(" " + sol[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static boolean isSafe(int maze[][], int x, int y) {
//         //if (x,y outside maze ) return false;
//         return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
//     }
//     public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
//         if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
//             sol[x][y] = 1;
//             return true;
//         }
//         //check if maze [x][y]is valid
//         if (isSafe(maze, x, y) == true) {
//             if (sol[x][y] == 1) {
//                 return false;
//             }
//             sol[x][y] = 1;
//             if (solveMazeUtil(maze, x + 1, y, sol)) {
//                 return true;
//             }
//             if (solveMazeUtil(maze, x, y + 1, sol)) {
//                 return true;
//             }
//             sol[x][y] = 0; //backtracking step
//             return false;
//         }
//         return false;
//     }
//     //output
//     public static boolean solvemaze(int maze[][]) {
//         int N = maze.length;
//         int sol[][] = new int[N][N];
//         if (solveMazeUtil(maze, 0, 0, sol) == false) {
//             System.out.print("Solution doesnot exist");
//             return false;
//         }
//         printSolution(sol);
//         return true;
//     }
//     public static void main(String[] args) {
//         int maze[][] = {{1, 0, 0, 0, 0},
//         {1, 1, 0, 1, 0},
//         {0, 1, 0, 0, 0},
//         {1, 1, 1, 1, 1},
//         {0, 1, 0, 0, 1}
//         };
//         solvemaze(maze);
//     }
// }


// public class Assignment{
//     public static void printSolution(int sol[][]){
//         for(int i=0;i<sol.length;i++){
//             for(int j=0;j<sol.length;j++){
//                 System.out.print(" "+sol[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static boolean isSafe(int maze[][],int x,int y,int sol[][]){
//         return (x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);
//     }
//     public static boolean solveMaze(int maze[][],int x,int y,int sol[][]){
//         if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
//             sol[x][y]=1;
//             return true;
//         }
//         //kaam
//         if(isSafe(maze,x,y,sol)==true){
//             if(sol[x][y]==1){
//                 return false;
//             }
//             sol[x][y]=1;
//             //down
//             if(solveMaze(maze,x+1,y,sol)){
//                 return true;
//             }
//             //right
//             if(solveMaze(maze,x,y+1,sol)){
//                 return true;
//             }
//             sol[x][y]=0;
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int maze[][]={{1,0,0,0,0},
//                       {1,1,0,1,0},
//                       {0,1,0,0,0},
//                       {1,1,1,1,1},
//                       {0,0,0,0,1}};
//         int N=maze.length;
//         int sol[][]=new int[N][N];
//         if(solveMaze(maze,0,0,sol)==true){
//             System.out.println("Solution exisits");
//             printSolution(sol);
//         }
//         else{
//             System.out.println("Solution does not exisits");
//         }
//     }
// }
// Question2 
// public class Assignment{
//     public static void keypadcombinations(String digits,String combination[],int idx,String curr){
//         if(digits.length()==0){
//             System.out.print("null");
//             return;
//         }  
//         if(idx==digits.length()){
//             System.out.println(curr);
//             return ;
//         }    
//         String letters=combination[digits.charAt(idx)-'0'];
//         for(int i=0;i<letters.length();i++){
//             keypadcombinations(digits,combination,idx+1,curr+letters.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         String digits="23";
//         String combination[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//         String curr="";
//         keypadcombinations(digits,combination,0,curr);
//     }
// }
//Question3
// public class Assignment {

//     public static void printSolution(int sol[][], int n) {
//         for (int x = 0; x < n; x++) {
//             for (int y = 0; y < n; y++) {
//                 System.out.print(sol[x][y] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static boolean isSafe(int x, int y, int sol[][], int n) {
//         return (x >= 0 && x < n && y >= 0 && y < n && sol[x][y] ==-1);
//     }

//     public static boolean solveKt(int x, int y, int expval, int sol[][], int xMove[], int yMove[], int n) {

//         if (expval == (n * n) - 1) {
//             return true;
//         }
//         for (int i = 0; i < 8; i++) {
//             int next_x = x + xMove[i];
//             int next_y = y + yMove[i];
//             if (isSafe(next_x, next_y, sol, n)) {

//                 sol[next_x][next_y] = expval;

//                 if (solveKt(next_x, next_y, expval + 1, sol, xMove, yMove, n)) {
//                     return true;
//                 } else {
//                     sol[next_x][next_y] = -1;
//                 }

//             }

//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int n = 8;
//         int sol[][] = new int[n][n];
//         for (int x = 0; x < n; x++) {
//             for (int y = 0; y < n; y++) {
//                 sol[x][y] = -1;
//             }
//         }

//         int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
//         int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

//         sol[0][0] = 0;

//         if (solveKt(0, 0, 1, sol, xMove, yMove, n)) {
//             System.out.println("Solution does exist");
//             printSolution(sol, n);
//         } else {
//             System.out.println("Solution does exist");
//         }
//     }
// }




// public class Assignment1{

//     public static void printSolution(int sol[][], int n) {
//         for (int x = 0; x < n; x++) {
//             for (int y = 0; y < n; y++) {
//                 System.out.print(" " + sol[x][y] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static boolean isSafe(int x, int y, int sol[][], int n) {
//         return (x >= 0 && x < n && y >= 0 && y < n && sol[x][y] == -1);
//     }

//     public static boolean solveMaze(int x, int y, int expval, int sol[][], int xmove[], int ymove[], int n) {

//         if (expval == (n * n) - 1) {
//             return true;
//         }

//         for (int i = 0; i < 8; i++) {
//             int next_x = x + xmove[i];
//             int next_y = y + ymove[i];

//             if (isSafe(next_x, next_y, sol, n)) {

//                 sol[next_x][next_y] = expval;

//                 if (solveMaze(next_x, next_y, expval + 1, sol, xmove, ymove, n)) {
//                     return true;
//                 } else {
//                     sol[next_x][next_y] = -1;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int n = 8;
//         int sol[][] = new int[n][n];

//         for (int x = 0; x < n; x++) {
//             for (int y = 0; y < n; y++) {
//                 sol[x][y] = -1;
//             }
//         }

//         int xmove[] = {-2, -1, 1, 2, 2, 1, -1, -2};
//         int ymove[] = {1, 2, 2, 1, -1, -2, -2, -1};
//         sol[0][0] = 0;

//         if (solveMaze(0, 0, 1, sol, xmove, ymove, n)) {
//             System.out.println("Solution exists");
//             printSolution(sol, n);
//         } else {
//             System.out.println("Solution does not exists");
//         }
//     }
// }


