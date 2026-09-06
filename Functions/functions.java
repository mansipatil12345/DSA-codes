

// addition:
// import java.util.*;
// public class functions {

// public static int CalculateSum(int num1,int num2){

//     int sum= num1 + num2;
//     return sum;
// }


// public static void main(String args[])
//     { 
//       try(Scanner sc = new Scanner(System.in)){
//       int a = sc.nextInt();
//       int b = sc.nextInt();

//       int sum1 = CalculateSum(a,b);
//       System.out.println("The sum is :" + sum1);
//      }

//     }
  
// }







// Swapping of numbers:

// import java.util.*;
// public class functions{

// public static void swap(int a,int b){


//     int temp ;

//     temp= a;
//       a = b;
//       b = temp;

//       System.out.println("a is : "+ a);
//       System.out.println("b is : "+ b);

// }


// public static void main(String args[]){
//    try(Scanner sc = new Scanner (System.in))
//    {
//        System.out.println("enter the value of a : ");

//         int a = sc.nextInt();

//         System.out.println("enter the value of b : ");

//         int b = sc.nextInt();

//          swap(a,b);

//    }
// }

// }



//Product of tw numbers:

// import java.util.*;

// public class functions{


//   public static int product (int a , int b){
   
//     int product = a*b;
//     return product;

//   }

//   public static void main(String args[]){
//      try(Scanner sc = new Scanner(System.in)){
//          System.out.print("enter the value of a:");
//          int a = sc.nextInt();

//          System.out.print("enter the value of b:");
//          int b = sc.nextInt();

//          int product1 = product(a,b);

//  System.out.print("The product is : "+ product1);

//      }
     
//   }
// }



//Binomial coefficient:

// import java.util.*;

// public class functions{


//   public static int factorial (int n){
   
//     int fact =1;
//    for(int i =1 ; i<= n ;i++){
//     fact = fact *i;
//    }
//    return fact;

//   }


//   public static int binomialcoefficient(int n ,int r){
     
//     int nfact=factorial(n);
//     int rfact=factorial(r);
//     int nmrfact=factorial(n-r);

//     return nfact/(rfact*nmrfact);
//   }

//   public static void main(String args[]){
//      try(Scanner sc = new Scanner(System.in)){
//          System.out.print("enter the value of n:");
//          int n = sc.nextInt();

//          System.out.print("enter the value of r:");
//          int r = sc.nextInt();


//          int fact1 = factorial(n);
//          int binomialcoefficient1= binomialcoefficient(n,r);

 
// System.out.println("The factorial is : "+ fact1);
//  System.out.println("The coefficient is : "+ binomialcoefficient1);
//      }
     
//   }
// }


