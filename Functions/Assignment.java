
// average of three numbers

// public class Assignment {
//   public static int average(int a , int b , int c)
//   {
          
//         int avg= (a+b+c)/3;
//         return avg;

//   }

//   public static void main(String args[]){
//       System.out.print(average(3,4,5));
   
//   }

// }


// method named isEven :
                
// import java.util.*;
// public class Assignment {
//   public static boolean isEven(int num)
//   {
//       return num%2==0;          // if we use if statement then it shows that if is redundant which means their is more easier way to solve this so we can write simply return num%2==0 

//   }

//   public static void main(String args[]){
//       try(Scanner sc = new Scanner(System.in)){
//         int n = sc.nextInt();

//         if(isEven(n)){
//             System.out.print("Number is Even");
//         }
//         else{
//             System.out.print("Number is not Even");
//         }
    
//       }

//   }

// }


//palindrome

// import java.util.*;
// public class Assignment{

// public static int rev(int n){

//     int rev =0;
//     while(n>0){
//         int lastdigit= n%10;
//         rev = (rev * 10)+ lastdigit;
//         n = n/10;

//     }
//     return rev ;
// }

// public static void palindrome(int n){
// // The issue in your code is caused by the multiline string literals in the palindrome method. In Java, string literals cannot span multiple lines without proper concatenation. The error "unclosed string literal" occurs because the string "yes a \n Palindrome" and "No not a \n Palindrome" are not properly closed before starting a new line.

// // To fix this, you should ensure that each string literal is properly enclosed within double quotes. You can either use concatenation or simply write the entire string on one line.
//      if(n==rev(n)){
//         System.out.print("yes a Palindrome");
//      }
//      else{
//         System.out.print("No not a Palindrome");
//      }
// }

// public static void main(String[] args) {
//     try(Scanner sc = new Scanner (System.in)){
//        int n = sc.nextInt();

//         palindrome(n);

//     }
// }

// }



//math.abs

// absolute value means -3 = 3,4=4
// basically |-3|=3;|4|=4


// import java.util.*;

// public class Assignment{

// public static int Absolutevalue(int n){
//      int AbsoluteVal = Math.abs(n);
//      return AbsoluteVal;
// }
// public static void main(String[] args) {
//     try(Scanner sc = new Scanner (System.in)){
//        int n = sc.nextInt();

//        System.out.println(Absolutevalue(n));
        
//     }
// }

// }


//Math.min

// import java.util.*;

// public class Assignment{

// public static int Minimumvalue(int a,int b){
//      int MinimumVal = Math.min(a,b);
//      return MinimumVal;
// }
// public static void main(String[] args) {
//     try(Scanner sc = new Scanner (System.in)){
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        System.out.println("Minimum value is : " + Minimumvalue(a,b));
        
//     }
// }

// }

// math.max
// import java.util.*;

// public class Assignment{

// public static int Maximumvalue(int a,int b){
//      int MaximumVal = Math.max(a,b);
//      return MaximumVal;
// }
// public static void main(String[] args) {
//     try(Scanner sc = new Scanner (System.in)){
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        System.out.println("Maximum value is : " + Maximumvalue(a,b));
        
//     }
// }

// }


// math.sqrt

// public class Assignment{

// public static float squarevalue(float a){
//      float sqrVal = (float)Math.sqrt(a);
//      return sqrVal;
// }
// public static void main(String[] args) {
//     try(Scanner sc = new Scanner (System.in)){
//        float a = sc.nextInt();
      

//        System.out.println("Square value is : " + squarevalue(a));
        
//     }
// }

// }





// math.pow

// public class Assignment{

// public static int powvalue(int a){
//       int  powVal =  (int)Math.pow(2,a);
//      return powVal;
// }
// public static void main(String[] args) {
//     try(Scanner sc = new Scanner (System.in)){
//        int a = sc.nextInt();
      

//        System.out.println("power value is : " + powvalue(a));
        
//     }
// }

// }


//sum of digits in integer
// import java.util.*;
// public class Assignment{

// public static int sumvalue(int n){
//       int sum=0;
      
//       while(n>0){
//         int lastdigit = n%10;
//          sum = sum + lastdigit;
//          n = n /10;
//       }
//       return sum;
      
// }
// public static void main(String[] args) {
//     try(Scanner sc = new Scanner (System.in)){
//        int n = sc.nextInt();
      

//        System.out.println("power value is : " + sumvalue(n));
        

//     }
// }

// }