// public class revision1 {
//     public static void main(String[] args) {
//         System.out.println("1,2,3,4");
//         System.out.println("1,2,3,4");
//         System.out.println("1,2,3,4");
//     }
// }


// public class revision1{
//     public static void main(String args[]){
//         char ch = 'a';
//         System.out.println(ch);
//         boolean var = false;
//         System.out.println(var);
//     }
// }

// public class revision1{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 5;
//         System.out.print(a+b);
//     }
// }


//input in java
// import java.util.*;

// public class revision1
// {
//     public static void main(String args[])
//     {
     
        
//             try(Scanner sc = new Scanner(System.in))
//             {
//                 int a= sc.nextInt();
//                 System.out.print(a);
                
//             }
       
//     }
    
// }
 


// type casting

// public class revision1{
//     public static void main(String args[]){
     
//             float marks1 =  99.999f;
//             int marks2 = (int)marks1;
//             System.out.println(marks2);
       
//     }
// }


// type casting is applicable for int se long where destination type  is greater than source type(widenening)
// type conversion is applicable where we narrow or explicitly convert float to int (narrowing)
// java promotion is applicable when there is expression (not on normal expression ) it considers byte, short , char operand to int
// and float , long , double to greater datatype


// public class revision1{
//     public static void main(String args[]){
//         char a = 'a';
//         char b = 'b';
//         System.out.println((int)a);
//         System.out.println((int)b);
//         System.out.println(b-a);


//     }
// }


// public class revision1{
//     public static void main(String args[]){
//         byte b = 5;
//         byte a =(byte)b*2;
//         System.out.println(a);
//     }
// }


// average
import java.util.*;
public class revision1{
    public static void main(String args[]){
        try(Scanner sc = new Scanner (System.in)){
              int a = sc.nextInt();
              int b = sc.nextInt();
              int c = sc.nextInt();

              int average= (a+b+c) /3;
              System.out.print(average);
        }
    }
}

