// public class suduko {

//     public static boolean isSafe(int suduko[][],int row,int col,int digit){
//         //row
//         for(int i=0;i<=8;i++){
//             if(suduko[i][col]==digit){
//                 return false;
//             }
//         }

//         //col
//         for(int j=0;j<=8;j++){
//             if(suduko[row][j]==digit){
//                 return false;
//             }
//         }

//         //grid
//         int sr=(row/3)*3;
//         int sc=(col/3)*3;
//         for(int i=sr;i<sr+3;i++){
//             for(int j=sc;j<sc+3;j++){
//                 if(suduko[i][j]==digit){
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }



//     public static boolean sudukoSolver(int suduko[][],int row,int col){
//         //base case
//         if(row==9){  //jaise hi row badte badte 9 hogayi that means row 0-8 fill hogaya hai tabhi meri row plus hokar 9 bani ans j=0 so tab true return coz pura suduko fill hogaya!
//             return true; //agar col=0 ki condition hata bhi di toh solution vohi rahega
//         }
       
//         int nextRow=row,nextCol=col+1;
//         if(col+1==9){
//             nextRow=row+1;
//             nextCol=0;
//         }
//         //kaam
//         //koi elemnent agar already placed hai suduko me toh is par niche ka operation perform nahi karna hai tab hume next row or col ke liye susdosolver ko call karna hai 
//         if(suduko[row][col]!=0){
//             return sudukoSolver(suduko,nextRow,nextCol);
//         }
//         for(int digit=1;digit<=9;digit++){
//             if(isSafe(suduko,row,col,digit)){
//                 suduko[row][col]=digit;
//                 if(sudukoSolver(suduko,nextRow,nextCol)){
//                     return true; //true aya toh place karo
//                 }
//                 suduko[row][col]=0; //false aya toh place mat karo 
//             }
//         }
//         return false;
//     }

//     public static void printSuduko(int suduko[][]){
//         System.out.println("------------------------suduko-----------------------");
//         for(int i=0;i<9;i++){
//             for(int j=0;j<9;j++){
//                 System.out.print(suduko[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int suduko[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
//         {4, 9, 0, 1, 5, 7, 0, 0, 2},
//         {0, 0, 3, 0, 0, 4, 1, 9, 0},
//         {1, 8, 5, 0, 6, 0, 0, 2, 0},
//         {0, 0, 0, 0, 2, 0, 0, 6, 0},
//         {9, 6, 0, 4, 0, 5, 3, 0, 0},
//         {0, 3, 0, 0, 7, 2, 0, 0, 4},
//         {0, 4, 9, 0, 3, 0, 0, 5, 7},
//         {8, 2, 7, 0, 0, 9, 0, 1, 3}};

//         if(sudukoSolver(suduko,0,0)){
//             System.out.println("solution exisits");
//             printSuduko(suduko);
//         }
//         else{
//              System.out.println("solution not exisits");
//         }
//     }
// }


