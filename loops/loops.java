
// public class practise {
//     public static  void main(String args[]){
// int n =5;
// char ch = 'A';
// for (int i=1;i<=n;i++){
//         for (int j=1;j<=i;j++){
//             System.out.print(ch);
//             ch++;
//         }
//         System.out.println();
        
//     }
// }

// }


// public class practise{
//     public static void main(String args[]){
//         int n =4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// public class practise{
//     public static void main(String args[]){
// int n = 4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i+1;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

//     }
// }


// public class practise{
//     public static void main(String args[]){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class practise{
//     public static void main(String args[]){
//         try(Scanner sc= new Scanner (System.in)){
//    int n = sc.nextInt();
//    if(n%3==0){
//     System.out.print("Fizz");
//    }
//    else if(n%5==0){
//     System.out.print("Buzz");
//    }
//    else if (n%15==0){
//     System.out.print("FizzBuzz");
//    }
//    else{
//     System.out.print(n);
//    }     
//         }
//     }
// }


// import java.util.*;
// public class practise{
//     public static void main(String args[]){
//         try(Scanner sc = new Scanner (System.in)){
//             int weeknumber= sc.nextInt();
//             switch(weeknumber){
//                 case 1,2,3,4,5->System.out.print("Weekday");
//                 case 6,7->System.out.print("Weekend");
//                 default->System.out.print("error");
//             }
//         }
//     }
// }



// import java.util.*;

// public class practise{
//     public static void main(String args[]){
//         try(Scanner sc = new Scanner (System.in)){

//         System.out.print("Enter the day , hour, minute:");
//             int day = sc.nextInt();
//             int hour = sc.nextInt();
//             int minute = sc.nextInt();

//         hour+=5;
//         minute+=30;

//         if(hour>24){
//             day++;
//             hour-=24;
//         }
//         if(minute>60){
//             hour++;
//             minute-=60;
//         }

//         System.out.print("day : "+ day + ", hour : " + hour+  ", minute : " + minute);
//         }
//     }
// }


// import java.util.*;

// public class practise{
//     public static void main(String args[]){
//         try(Scanner sc = new Scanner (System.in)){
            
//             int evensum=0;
//             int oddsum=0;
//             int choice;

//         do { 
//             System.out.print("Enter a number: ");
//             int number  = sc.nextInt();
           

//             if(number %2 == 0){
//                 evensum= evensum + number;
//              }
//              else{
//                oddsum = oddsum + number;
//              }
   
//              System.out.print("Do you want to continue? : press 1 to continue otherwise 0 to stop : ");
//              choice = sc.nextInt();

            
//         } while (choice==1);
//         System.out.println("Sum of even number is : " + evensum);
//         System.out.println("Sum of odd number is : " + oddsum);

//         }
//     }
        
// }

// import java.util.*;

// public class practise{
//     public static void main(String args[]){
//         try(Scanner sc = new Scanner(System.in)){
//             int number = sc.nextInt();
//             int fact = 1;
//             for(int i =1;i<=number;i++ ){
//                 fact = fact*i;
//             }
//                System.out.println("factorial of given number is :"+ fact);
//         }
//     }
    
    
// }


// import java.util.*;

// public class practise{
//     public static void main(String args[]){
//         try(Scanner sc = new Scanner(System.in)){
//         System.out.println("Enter the number for which you want to print the table :");
//           int number = sc.nextInt();
           
//             for(int i =1;i<=10;i++ ){
//                 System.out.println(number+"*"+i+"="+number*i);
//             }
//     }
// }

// }


// import java.util.*;

// public class practise{
//     public static void main(String args[]){
//         try(Scanner sc = new Scanner(System.in)){
//         int n= sc.nextInt();

//          if(n==2){
//             System.out.print("number is prime");
//          }
//          else{

//             boolean isPrime = true;
//         for(int i = 2; i <= Math.sqrt(n);i++)
//         {
//             if(n%i==0){
//                 isPrime= false;
    
//             }

//         }
        
//         if(isPrime == true){
//             System.out.print("number is prime");
//         }
//         else{
//             System.out.print("number is not prime");
//         }

//          }
//     }
// }

// }


// import java.util.*;

// public class practise{
//     public static void main(String args[]){
//         try(Scanner sc = new Scanner(System.in)){
//         System.out.println("Enter the number:");
//           int number = sc.nextInt();
//            int i=1;
//            int sum = 0;
//             while(i<=number){
//                  sum = sum + i;
//                  i++;
//               }
//               System.out.print(sum);
//             }
           
//       }


// }



// public class practise{
//     public static void main(String args[]){
        
//           int number = 10899;
//           int lastDigit;
//           int rev=0;

//           while(number>0){
//             lastDigit=number%10;
//             rev=(rev*10)+lastDigit;
//             number=number/10;

//           }
//           System.out.print(rev);
           
           
//       }


// }


// import java.util.*;
// public class loops{
//     public static void main (String args[]){
//           try(Scanner sc=new Scanner (System.in)){
            
//           do{
//             System.out.println("Start entering the number :");

//             int n = sc.nextInt();
//             if(n%10==0){
//               break;
//             }
//             System.out.println(n);
//           }while(true);
//           sc.close();
//           }
       
//           }
//     }  




    
