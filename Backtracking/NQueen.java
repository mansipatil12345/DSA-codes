//to print 
// public class NQueen{
//     public static boolean isSafe(char board[][],int row,int col){
//         //vertical up
//         for(int i=row-1;i>=0;i--){
//             if(board[i][col]=='Q'){
//                 return false;
//             }
//         }
//         //diagonal left
//         for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }

//         //diagonal right 
//         for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nQueens(char board[][],int row){
//         if(row==board.length){
//             printboard(board);
//             return;
//         }

        
//         for(int j=0;j<board.length;j++){
//             if(isSafe(board, row, j)){
//                   board[row][j]='Q';
//                   nQueens(board,row+1);
//                   board[row][j]='x';
//             }
//         }
//     }

//     public static void printboard(char board[][]){
//         System.out.println("--------------------chess board---------------------");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         char board[][]=new char[n][n];

//         //initialize
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                board[i][j]='x';
//             }
//         }
//         nQueens(board, 0);
//     }
// }



//to check the count instead of print 
// public class NQueen{
//     public static boolean isSafe(char board[][],int row,int col){
//         //vertical up
//         for(int i=row-1;i>=0;i--){
//             if(board[i][col]=='Q'){
//                 return false;
//             }
//         }
//         //diagonal left
//         for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }

//         //diagonal right 
//         for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nQueens(char board[][],int row){
//         if(row==board.length){
//             // printboard(board);
//             count++;
//             return;
//         }

        
//         for(int j=0;j<board.length;j++){
//             if(isSafe(board, row, j)){
//                   board[row][j]='Q';
//                   nQueens(board,row+1);
//                   board[row][j]='x';
//             }
//         }
//     }

//public static void printboard(char board[][]){
//         System.out.println("--------------------chess board---------------------");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     static int count = 0; 
// //inside a function, then:
// //Every recursive call would create its own copy of count
// //Values would NOT be shared
// //Final answer would be wrong (mostly 0 or incorrect) 
// //static means one shared variable for the whole class
// //All recursive calls use the same count variable,t.c will be same 

//     public static void main(String[] args) {
//         int n = 4;
//         char board[][]=new char[n][n];

//         //initialize
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                board[i][j]='x';
//             }
//         }
//         nQueens(board, 0);
//         System.out.println("total ways to solve n queens = "+count);
//     }
// }


//now for another questions 
//check whether solution exist or not if yes so print one 
//for that we will modify the nQueen function
// public class NQueen{
//     public static boolean isSafe(char board[][],int row,int col){
//         //vertical up
//         for(int i=row-1;i>=0;i--){
//             if(board[i][col]=='Q'){
//                 return false;
//             }
//         }
//         //diagonal left
//         for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }

//         //diagonal right 
//         for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static boolean nQueens(char board[][],int row){
//         if(row==board.length){
//             // printboard(board);
//             count++;
//             return true;
//         }

//         //after placing one queen we will check that if its possible to place n-1 queen for that make function boolean and in main func if sol 
//         //exist so print 
//         for(int j=0;j<board.length;j++){
//             if(isSafe(board, row, j)){
//                   board[row][j]='Q';
//                   if(nQueens(board,row+1)){
//                      return true;
//                   }
//                   board[row][j]='x';
//             }
//         }
//         return false;
//     }

//     public static void printboard(char board[][]){
//         System.out.println("--------------------chess board---------------------");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     static int count = 0; 
// //inside a function, then:
// //Every recursive call would create its own copy of count
// //Values would NOT be shared
// //Final answer would be wrong (mostly 0 or incorrect) 
// //static means one shared variable for the whole class
// //All recursive calls use the same count variable 

//     public static void main(String[] args) {
//         int n = 4;
//         char board[][]=new char[n][n];

//         //initialize
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                board[i][j]='x';
//             }
//         }
//         //then print whether sol exist or not with true or false coz function now returns true or false
//         if( nQueens(board, 0)){
//             System.out.println("Solution is possible");
//             printboard(board);
//         }else{
//             System.out.println("Solution is not possible");
//         }
       
//         // System.out.println("total ways to solve n queens = "+ count);
//     }
// }


