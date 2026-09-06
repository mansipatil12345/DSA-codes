
// //     public static void main(String args[]){
// //         int a=10;
// //         int b=5;
// //         int sum=a+b;
// //         System.out.println(sum);
// //     }
// // }

// // import java.util.*;
// // public class revision{
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         // String input = sc.nextLine();
// //         // System.out.print(input);
// //         float a= 25.9999f;
// //         int b=(int)a;// to consider that decimal value as float 
// //         System.out.println(b);
// //     }
// // }

// //int to float - widening small to large(implicit)type conversion
// //float to int - loss of data - type casting (explicit)type casting narrowing 


// // import java.util.*;
// // public class revision{
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         // String input = sc.nextLine();
// //         // System.out.print(input);
// //         Float a= sc.nextFloat();
// //         Float b= sc.nextFloat();
// //         Float c= sc.nextFloat();
// //         Float total = (a+b+c)/3;
// //         System.out.println(total);
// //         float gst= total+(0.18f*total);
// //         System.out.println(gst);
// //     }
// // }

// // import java.util.*;
// // public class revision{
// //     public static void main(String args[]){
// //         // Scanner sc = new Scanner(System.in);
// //         int a=10;
// //         int b=20;
// //         System.out.println(!(a==b));
        
// //     }
// // }


// // public class revision {
// //     public static void main(String[] args)
// //     {
// //         int x = 9, y = 12;
// //         int a = 2, b = 4, c = 6;
// //         float exp = 4.0f/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (float)(a + b*y);
// //         System.out.println(exp);

// //     }

// // }


// //if -else
// // import java.util.*;
// // public class revision{
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //             int year = sc.nextInt();
// //             if(year%4!=0){
// //                 System.out.println("Not a leap year");
// //             }
// //             else if(year%400!=0 && year%100==0){
// //                 System.out.println("Not a leap year");
// //             }
// //             else{
// //                 System.out.println("Leap year");
// //             }
// //     }
// // }

// //variable = condition ? statement1 : statement2 ;
// // import java.util.*;
// // public class revision {
    
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter the number : ");
// //         int n = sc.nextInt();
// //         int i= 1;
// //         int sum =0;
// //         while(i<=n){                  
// //             sum = sum +i; //sum+=i;
// //             i++;
// //         }
// //         System.out.print(sum);
// //     }
// // }


// // initalization 
// // while(condition){
// //     updation
// // }


// // for (initialization , condition, updation )

// // initalization
// // do {
// //do something //updation 
// //}while(condition)



// // import java.util.*;
// // public class revision {
    
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter the number : ");
// //         int lines = sc.nextInt();
// //         // int i =1;
// //         // while(i<=lines){                  
// //         //     System.out.println("****");
// //         //     i++;
// //         // }

// //         for(int i=1;i<=lines;i++){
// //             System.out.println("****");
// //         }
// //         System.out.println();
// //     }
// // }


// //reverse 10899  9
// // import java.util.*;
// // public class revision {
    
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter the number : ");
// //         int n = sc.nextInt();
// //         while(n>0){
// //             int lastDigit = n%10;                   // remainder nikal kar print kiya then divide kiya so number revierse ho jayega
// //             System.out.print(lastDigit+" ");
// //             n=n/10;
// //         }
       
// //     }
// // }

// // other shortcut 


// // import java.util.*;
// // public class revision {
    
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter the number : ");
// //         int n = sc.nextInt();
// //         int rev=0;
// //         while(n>0){
// //             int lastDigit = n%10;                   // remainder nikal kar print kiya then divide kiya so number revierse ho jayega
// //             rev = (rev*10)+lastDigit;
// //             n=n/10;
// //         }
// //         System.out.println(rev);
// //     }
// // }

// // import java.util.*;             
// // public class revision {
    
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //               //remember when there is jab tak means do-while

// //             do { 
// //                 System.out.println("Enter your number : ");
// //                 int n = sc.nextInt();
// //                 if(n%10==0){
// //                     break;      //to break the loop
// //                 }
// //                 System.out.println(n);
// //             } while (true);
// //     }
// // }



// // import java.util.*;             
// // public class revision {
    
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //               //remember when there is jab tak means do-while

// //             do { 
// //                 System.out.println("Enter your number : ");
// //                 int n = sc.nextInt();
// //                 if(n%10==0){
// //                     continue;      //continue to skip an iteration
// //                 }
// //                 System.out.println("Your number was :"+n);
// //             } while (true);
// //     }
// // }




// // import java.util.*;
// // public class revision {

// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter the number:");
// //         int n = sc.nextInt();
// //         boolean isPrime = true;
// //         if(n==2){
// //             System.out.print("number is Prime");
// //         }
// //         else{
// //             for(int i=2;i<=Math.sqrt(n);i++){
// //                 if(n%i==0){
// //                      isPrime= false;
// //                 }
// //              }
// //              if(isPrime==true){
// //                  System.out.println("n is  prime");
// //              }
// //              else{
// //                  System.out.println("n is not prime");
// //              }
// //         }
// //     }
// // }


// // public class revision{
// //     public static void main(String args[]){
// //        int num=10899;
// //        int rev=0;
// //     while(num>0){
// //          int lastDigit=num%10;
// //          rev = (rev*10)+lastDigit;
// //          num=num/10;
// //        }
// //     }
// // }


// //while (inialize,conditon,updation)
// //for(intialize,condition,updation)
// //do-while(intialize,updation,consition)

// // for reversing 
// // while(num>0),lastdigit=n%10 , rev = (rev*10)+lastdigit, n=n/10;




// import java.util.*;
// public class revision{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number: ");
//         int n = sc.nextInt();
       

//         if(n==2){
//             System.out.println("Number is Prime");
//         }
//         else{
//             boolean isPrime = true;

//             for(int i=2;i<=Math.sqrt(n);i++)
//             {
//                 if(n%i==0)
//                 {
//                     isPrime=false;
//                 }
//             }

//                 if(isPrime==true){
//                     System.out.println("Number is Prime");
//                 }
//                 else{
//                     System.out.println("Number is not Prime");
//                 }
//         }
//     }
// /}

// public class revision{
//     public static void main(String args[]){
//         // Scanner sc = new Scanner(System.in);
//         int n =4;
//         char ch = 'A';
//         for(int i =1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class revision{
//     public static int factorial(int n){
//         int f=1;
//         for(int i =1;i<=n;i++){
//             f= f*i;
//         }
//         return f;
//     }

//     public static int binCoefficient(int n,int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);
//         int binCoeff = fact_n/(fact_r*fact_nmr);
//         return binCoeff;
//     }

//     public static int sum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }

//     public static float sum(float a ,float b){
//         float sum = a+b;
//         return sum;
//     }


//     public static void PrimeRange(int n){
//         for(int i=2;i<=n;i++){
//             if(isPrime(i)) {
//                 System.out.print(i+" ");
//             }
//         }
//         System.out.println();
//     }

//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//                 if(n%i==0){
//                     return false;
//                 }    
//         }
        
//         return true;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         PrimeRange(n);
//     }
// }



// public class revision{
//     public static void Primerange(int n){
//         for(int i=2;i<=n;i++){
//             if(isPrime(i)){
//                 System.out.println(i);
//             }
//         }
//     }

//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
// }

//         public static void BinToDec(int binNum)
//         {   
//             int pow =0;
//             int DecNum = 0;
//             while(binNum>0){
//                 int lastDigit = binNum%10;
//                 DecNum = DecNum+ (lastDigit*(int)Math.pow(2,pow));
//                 pow++;
//                 binNum=binNum/10;
//             }
//             System.out.println("Decimal of "+binNum +"= "+ DecNum);
//         }

//         public static void DecToBin(int DecNum){
//             int myNum=DecNum;
//             int pow=0;
//             int BinNum=0;
//             while(DecNum>0){
//                 int rem  = DecNum%2;
//                 BinNum = BinNum + (rem*(int)Math.pow(10,pow));
//                 pow++;
//                 DecNum=DecNum/2;
//             }
//             System.out.println("Binary number of " + myNum + "=" + BinNum);
//         }

//     public static void main(String args[]){
//        DecToBin(7);
//     }
// }


// public class revision{
    // public static void hollow_rectangle(int totRows,int totCols){
    //     for(int i=1;i<=totRows;i++){
    //         for(int j=1;j<=totCols;j++){
    //             if(i==1 || i==totRows || j==1 || j==totCols){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void pyramid(int totRows){
    //     for(int i=1;i<=totRows;i++){
    //         for(int j=1;j<=totRows-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void inverted_half_pyramid_numbers(int totRows){
    //     int count=1;
    //     for(int i=1;i<=totRows;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(count+" ");
    //             count++;
    //         }
    //         System.out.println();
    //     }
    // }

    
//     public static void butterfly(int n){
        
//         //1st half
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=(2*i)-1;j++){
//                 System.out.print("*");
//             }
//            System.out.println();
//         }

//         //2nd half
//         for(int i=n;i>=1;i--){
//             //spaces
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=(2*i)-1;j++){
//                 System.out.print("*");
//             }
//            System.out.println();
//         }
        
//     }


//     public static void main(String args[]){
//      butterfly(4);
//     }
// }








