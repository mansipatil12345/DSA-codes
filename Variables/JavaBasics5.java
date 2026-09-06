// import java.util.*;
// public class JavaBasics5{

//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
       
//          if (a%2==0){
//             System.out.println("It's Even");
//          }
//          else{
//             System.out.println("It's Odd");
//          }
//          sc.close();
//     }
// }


// import java.util.*;
// public class JavaBasics5{

//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);

//         int age = sc.nextInt();
       
//          if (age<18){
//             System.out.println("You are not adult,you cannot drive");
//          }
//          else if(age>18 && age<60){
//             System.out.println("You  are adult ,you can drive");
//          }
//          else{
//             System.out.println("You are senior ctizen drive safely :)");
//          }
//          sc.close();
//     }
// }


// import java.util.*;
// public class JavaBasics5{

//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);

//         int income = sc.nextInt ();
//         int tax;

//          if (income<500000){
//             tax=0;
//          }
//          else if(income>=500000 && income<100000){
//             tax = (int)(income*(0.2f));
//             System.out.println(tax);
//          }
//          else{

//             tax = (int)(income*(0.3f));
//             System.out.println(tax);
//          }
//          System.out.println("Your tax is " + tax); 
//          sc.close();
//     }
// }


// import java.util.*;
// public class JavaBasics5{

//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);

//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();

//          if (A>=B && A>=C){
//             System.out.println("A is largest");
//          }
//          else if (B>=C){
//             System.out.println("B is largest");
//          }
//          else{
//             System.out.println("C is largest");
//          }
//          sc.close();
//     }
// }


// import java.util.*;
// public class JavaBasics5{

//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);

//         int number = sc.nextInt();
        
//     String type =((number%2)==0)? "even":"odd";
//     System.out.println(type);

//          sc.close();
//     }
// }


// import java.util.*;
// public class JavaBasics5{

//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);

//         int marks = sc.nextInt();
        
//     String reportcard =(marks>=33)? "Pass":"Fail";
//     System.out.println(reportcard);

//          sc.close();
//     }
// }


import java.util.*;

public class JavaBasics5{

    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in))
         {
            System.out.println("Enter A:");
            int A = sc.nextInt();
            System.out.println("Enter B:");
            int B = sc.nextInt();
            System.out.println("Enter operator:");
            char operator = sc.next().charAt(0);
            
        
            switch(operator)
            {
                case'+' -> System.out.println(A+B);
                
                case '-' -> System.out.println(A-B);
                
                case '*' -> System.out.println(A*B);
                
                case '/' -> System.out.println(A/B);
                
                case '%' -> System.out.println(A%B);
                
                default -> System.out.println("Not able to calculate,sorry!! :< ");
            }  
         }
    }
}
