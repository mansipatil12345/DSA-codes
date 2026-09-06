// import java.util.*;

// public class revision1{
//     public static boolean search(int matrix[][],int key){
//           for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==key){
//                     System.out.print("Key found at index:("+i+","+j+")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Key not found");
//         return false;
//     }

//     public static int largestelement(int matrix[][]){
       
//         int smallest=Integer.MAX_VALUE;
//         int rowindex=-1,colindex=-1;

//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]<smallest){
//                     smallest=matrix[i][j];
//                     rowindex=i;
//                     colindex=j;
//                 }
//             }
           
//         }
//         System.out.println("Largest eleement found at ("+rowindex+","+colindex+")");
//         return smallest;
//     }

//     public static void main(String args[]){
//         int matrix[][]=new int[3][3];
//         int n= matrix.length , m=matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//         search(matrix,5);
//         System.out.println(largestelement(matrix));
//     }
// }






// // //spiral matrix
// // public class revision{
// //     public static void printSpiral(int matrix[][]){
// //         int startRow=0;
// //         int startCol=0;
// //         int endRow=matrix.length-1;
// //         int endCol=matrix[0].length-1;
// //         while(startRow<=endRow && startCol<=endCol){
// //             //top
// //             for(int j=startCol;j<=endCol;j++){
// //                 System.out.print(matrix[startRow][j]+" ");
// //             }
// //             //right
// //             for(int i=startRow+1;i<=endRow;i++){
// //                 System.out.print(matrix[i][endCol]+" ");
// //             }
// //             //bottom
// //             for(int j=endCol-1;j>=startCol;j--){
// //                 if(startRow==endRow){
// //                     break;
// //                 }
// //                 System.out.print(matrix[endRow][j]+" ");
// //             }
// //             //left
// //             for(int i=endRow-1;i>=startRow+1;i--){
// //                 if(startCol==endCol){
// //                     break;
// //                 }
// //                 System.out.print(matrix[i][startCol]+" ");
// //             }
// //             startCol++;
// //             startRow++;
// //             endRow--;
// //             endCol--;
// //         }
// //     }
// //     public static int diagonalSum(int matrix[][]){
// //         int sum=0;
// //         //time complexity O(n^2)
// //         // //primary
// //         // for(int i=0;i<matrix.length;i++){
// //         //     for(int j=0;j<matrix[0].length;j++){
// //         //         if(i==j){
// //         //             sum+=matrix[i][j];
// //         //         }
// //         //         else if(i+j==matrix.length-1){
// //         //             sum+=matrix[i][j];
// //         //         }
// //         //     }
// //         // }
// //         //optimized code 
// //         for(int i=0;i<matrix.length;i++){
// //             //pd
// //             sum+=matrix[i][i];
// //             //sd
// //             if(i!=matrix.length-1-i){
// //                 sum+=matrix[i][matrix.length-i-1];
// //             }
// //         }
// //         return sum;
// //     }
// //     public static boolean staircaseSearch(int matrix[][],int key){
// //         int row=0, col=matrix[0].length-1;
// //         while(row<matrix.length && col>=0){
// //             if(matrix[row][col]==key){
// //                 System.out.println("found key at ("+row+","+col+")");
// //                 return true;
// //             }
// //             else if(key<matrix[row][col]){
// //                 col--;
// //             }
// //             else{
// //                 row++;
// //             }
// //         }
// //         System.out.println("key not found!");
// //         return false;
// //     }
// //     public static void main(String args[]){
// //         int matrix[][]={{10,20,30,40},
// //                         {15,25,35,45},
// //                         {27,29,37,48},
// //                         {32,33,39,50}};
// //         // printSpiral(matrix);
// //         // System.out.print(diagonalSum(matrix));
// //         int key = 33;
// //         staircaseSearch(matrix, key);
// //     }
// // // }
// // public class revision {

// //     // public static int numberofsevens(int matrix[][]){
// //     //     int count=0;
// //     //     int k=7;
// //     //     for(int i=0;i<matrix.length;i++){
// //     //         for(int j=0;j<matrix[0].length;j++){
// //     //             if(matrix[i][j]==k){
// //     //                 count++;
// //     //             }
// //     //         }
// //     //     }
// //     //     return count;
// //     // }
// //     // public static int sumofrow(int matrix[][]) {
// //     //     int sum = 0;
// //     //         for (int j = 0; j < matrix[0].length; j++) {
// //     //             sum+=matrix[1][j];
// //     //     }
// //     //     return sum;
// //     // }
// //     public static void printMatrix(int matrix[][]) {
// //         for (int i = 0; i < matrix.length; i++) {
// //             for (int j = 0; j < matrix[0].length; j++) {
// //                 System.out.print(matrix[i][j] + " ");
// //             }
// //             System.out.println();
// //         }
// //     }

// //     public static void main(String[] args) {

// //         int row = 2;
// //         int col = 3;

// //         int matrix[][] = {{2, 3, 7},
// //         {5, 6, 7}};

// //         printMatrix(matrix);

// //         int transpose[][] = new int[col][row];
// //         for (int i = 0; i < row; i++) {
// //             for (int j = 0; j < col; j++) {
// //                     transpose[j][i]=matrix[i][j];
// //             }
// //         }
// //         printMatrix(transpose);
// //     }

// // }
