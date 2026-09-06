
// // public class assignment {
// //     public static int search(int matrix[][],int key ){
// //         int count=0;
// //         for(int i=0;i<=matrix.length-1;i++){
// //            for(int j=0;j<=matrix[0].length-1;j++)
// //            {
// //                 if(matrix[i][j]==key){
// //                     count = count+1;
// //                 }
                
// //            }
// //         }
// //         return count;
// //     }
// //     public static void main(String args[]){
// //         int matrix[][]={{4,7,8},
// //                         {8,8,7}};
// //         int key=7;
// //         System.out.print(search(matrix,key));
// //     }
// // }

// // // assignment2
// // public class assignment{
// //     public static int sumrow(int matrix[][]){
// //     int sum=0;
// //     int row=1;
// //     for(int col=0;col<=matrix[0].length-1;col++){
// //         sum += matrix[row][col];
// //     }
// //     return sum;
// // }
// // public static void main(String args[]){
// //     int matrix[][]={{1,4,9},
// //                     {11,4,3},
// //                     {2,2,3}};
// //     System.out.print(sumrow(matrix));
// // }

// // }



// // assignment3
// public class assignment{
//     public static void main(String[] args){
//         int row=2;
//         int column=3;
//         int matrix[][]={{2,3,7},
//                         {5,6,7}};
        
//         printmatrix(matrix);

//         int transpose[][] = new int[column][row];
//         for(int i=0; i<row;i++){
//             for(int j=0; j<column;j++){
//                 transpose[j][i]= matrix[i][j];
//             }
//         }
        
//         printmatrix(transpose);
//     }
  


//     public static void printmatrix(int matrix[][]){
//         System.out.println("The matrix is :");
        
//             for(int i=0;i<matrix.length;i++){
//                 for(int j=0;j<matrix[0].length;j++){
//                     System.out.print(matrix[i][j]+" ");
//                 }
//                 System.out.println("");

//         }
//         System.out.println();
//     }
// }


