// hollow rectangle

// public class star{
// public static void hollow_rectangle(int totalRows , int totalCols){

// for(int i = 1; i <= totalRows; i++){  // remember that i and j should start with 1 not with 0
//       for(int j= 1; j<= totalCols;j++){

//         if(i==1 || i==totalRows || j==1||j==totalCols){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();   // this line is very important
// }


// }
// public static void main(String args[])
// {
//     hollow_rectangle(9, 8);
// }

// }




// public class star{
    
// public static void hollow_rectangle(int totRows,int totCols){
//  for(int i = 1;i<=totRows;i++){
// for(int j = 1;j<=totCols;j++){
//  if(i==1 || i==totRows || j == 1|| j==totCols){
//     System.out.print("*");
//  }
//  else{
//     System.out.print(" ");

//   }
 
//  }
//  System.out.println();
// }

// }
// public static void main(String args[]){
//     hollow_rectangle(4,5);
// }

// }


// public class star{

// public static void inverted_py(int n)
// {
// for(int i = 1; i <=n; i++){
// // spaces
// for(int j =1;j<=n-i;j++ ) {
//    System.out.print(" ");
// }
// //stars
// for(int j = 1; j <=i;j++){
//    System.out.print("*");
// }
// System.out.println();
// }
// }

// public static void main (String args[])
// {

// inverted_py(4);
// }

// }


// public class star{

// public static void inverted_halfpynum(int n)
// {
// for(int i = 1; i <=n; i++){
// // spaces
// for(int j =1;j<=n-i+1;j++ ) {
//    System.out.print(j+" ");
// }
// //stars
// System.out.println();
// }
// }


// public static void main (String args[])
// {

// inverted_halfpynum(5);
// }

// }


// public class star{

//    public static void floyds_triangle(int n)
//    {
//       //lines
//       int counter=1;
//    for(int i = 1; i <=n; i++){
  
//       //counter
      
//    for(int j =1;j<=i;j++ ) {
//      System.out.print(counter+" ");
//       counter++;
//    }
   
//    System.out.println();
//    }
//    }
   
   
//    public static void main (String args[])
//    {
   
//    floyds_triangle(5);
//    }
   
//    }




// public class star{

   
//    public static void triangle(int n )
//    {
//       for(int i =1 ; i<=n;i++)  {
//        for(int j = 1; j<=i;j++){
//         if((i+j)%2==0){
//              System.out.print("1"+" ");
//        }
//          else{
//               System.out.print("0"+" ");
//       }

//        }
//        System.out.println();

//       }      

//    }

//    public static void main (String args[])
//    {
   
//    triangle(5);
//    }
   
//    }




// public class star{

   
//    public static void butterfly(int n )
//    {
//       for(int i=1;i<=n;i++)
//       {

//           for(int j=1;j<=i;j++){
              
//            System.out.print("*");

//           }
//           for( int j=1;j<=2*(n-i);j++){

//             System.out.print(" ");
//           }

//           for(int j=1;j<=i;j++){
              
//             System.out.print("*");
 
//            }
//            System.out.println();

//       }

//       for(int i =n;i>=1;i--)
//       {
       
//          for(int j=1;j<=i;j++){
              
//             System.out.print("*");
 
//            }
//            for( int j=1;j<=2*(n-i);j++){
 
//              System.out.print(" ");
//            }
 
//            for(int j=1;j<=i;j++){
               
//              System.out.print("*");
  
//             }
//             System.out.println();
 
         
//       }

//    }

//    public static void main (String args[])
//    {
   
//    butterfly(4);
//    }
   
//    }




// public class star{

   
//    public static void solid_rhombus(int n )
//    {

// for(int i = 1; i<=n;i++){

//    for(int j=1;j<=n-i;j++){
//       System.out.print(" ");
//    }
//    for(int j=1;j<=n;j++){
//       System.out.print("*");
//    }
//    System.out.println();
// }
   

//    }

//    public static void main (String args[])
//    {
   
//    solid_rhombus(4);
//    }
   
//    }



// public class star{

   
//    public static void hollow_rhombus(int n )
//    {

// for(int i = 1; i<=n;i++){
// //spaces
//    for(int j=1;j<=n-i;j++){
//       System.out.print(" ");
//    }
//    for(int j=1 ;j<=n;j++){
//       if(i==1||i==n||j==1||j==n){
//          System.out.print("*");
//       }
//       else{
//          System.out.print(" ");
//       }
//    }
      
//    System.out.println();
// }
//    }
//    //hollow rectangle -stars
   


//    public static void main (String args[])
//    {
   
//    hollow_rhombus(4);
//    }
   
//    }



// public class star{

   
//    public static void diamond(int n )
//    {
//       for(int i=1;i<=n;i++)
//       {
// //spaces
          
//           for( int j=1;j<=n-i;j++){

//             System.out.print(" ");
//           }
// //stars
//           for(int j=1;j<=(2*i)-1;j++){
              
//             System.out.print("*");
 
//            }
//            System.out.println();

//       }

//       for(int i =n;i>=1;i--)
//       {
//          for( int j=1;j<=n-i;j++){

//             System.out.print(" ");
//           }
// //stars
//           for(int j=1;j<=(2*i)-1;j++){
              
//             System.out.print("*");
 
//            }
//            System.out.println();

//       }

//    }

//    public static void main (String args[])
//    {
   
//    diamond(5);
//    }
   
  //  }




// public class star{
// public static void square(int n)
// {
//   for(int i =1;i<=n;i++){
//      for(int j=1;j<=n;j++){
//       System.out.print("* ");
//      }
//      System.out.println();
//   }
  
// }
//  public static void main(String agrs[]){
//    square(5);
//  }
// }

// public class star{
//   public static void bottom_left_tri(int n){
//     for(int i =1; i<=n;i++){
//       for(int j=1 ;j<=i;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// public static void main(String args[]){
//   bottom_left_tri(5);
// }
// }

// public class star{
//   public static void bottom_left_tri(int n){
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<n-i+1;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// public static void main(String args[]){
//   bottom_left_tri(5);
// }
// }



// public class star{

  // public static void inverted_py(int n)
  // {
  // for(int i = 1; i <=n; i++){
  // // spaces
  // for(int j =1;j<=n-i;j++ ) {
  //    System.out.print(" ");
  // }
  // //stars
  // for(int j = 1; j <=i;j++){
  //    System.out.print("*");
  // }
  // System.out.println();
  // }
  // }
  
  // public static void main (String args[])
  // {
  
  // inverted_py(4);
  // }
  
  // }


  // public class star{

  // public static void inverted_py(int n)
  // {
  // for(int i = 1; i <=n; i++){
  // // spaces
  // for(int j =1;j<=i-1;j++ ) {
  //    System.out.print(" ");
  // }
  // //stars
  // for(int j = 1; j <=n-i+1;j++){
  //    System.out.print("*");
  // }
  // System.out.println();
  // }
  // }
  
  // public static void main (String args[])
  // {
  
  // inverted_py(5);
  // }
  
  // }


  // public class star{
  //   public static void X_pattern(int rows,int cols){
  //     for(int i = 1;i<=rows;i++){
  //       for(int j=1; j<=cols;j++){
  //         if(i==j || i+j==6)
  //         {
  //        System.out.print("*");
  //         }
  //         else{
  //           System.out.print(" ");
  //         }
         
  //       }
  //       System.out.println();
  //     }
  //   }
  //   public static void main(String args[]){
  //     X_pattern(5,5);
  //   }
  // }


// public class star{

// public static void inverted_halfpynum(int n)
// {
// for(int i = 1; i <=n; i++){

// for(int j =1;j<=i;j++ ) {
//    System.out.print(i+" ");
// }
// System.out.println();
// }
// }
// public static void main (String args[])
// {

// inverted_halfpynum(5);
// }
// }


public class star{

public static void floyds_triangle(int n)
{
  int counter =1;
for(int i = 1; i <=n; i++)
{

for(int j =1;j<=i;j++ ) 
{
   System.out.print(counter+" ");
   counter++;
}
System.out.println();
}
}
public static void main (String args[])
{

floyds_triangle(5);
}
}

// public class star{

//    public static void floyds_triangle(int n)
//    {
//       //lines
//       int counter=1;
//    for(int i = 1; i <=n; i++){
  
//       //counter
      
//    for(int j =1;j<=i;j++ ) {
//      System.out.print(counter+" ");
//       counter++;
//    }
   
//    System.out.println();
//    }
//    }
   
   
//    public static void main (String args[])
//    {
   
//    floyds_triangle(5);
//    }
   
//    }
