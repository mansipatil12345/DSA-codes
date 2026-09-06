// import java.util.*;
// public class JavaBasics6{

//     public static void main (String args[]){
//         try(Scanner sc = new Scanner(System.in)){

//         int weeknumber = sc.nextInt();

//         switch (weeknumber) {
//             case 1 -> System.out.println("Monday");
//             case 2 -> System.out.println("Tuesday");
//             case 3 -> System.out.println("Wedday");
//             case 4 -> System.out.println("Thursday");
//             case 5 -> System.out.println("Friday");
//             case 6 -> System.out.println("Satday");
//             case 7 -> System.out.println("Sunday");
            
//           default->System.out.println("Not a week number"); 
//         }
//          sc.close();
//         }
//     }
// }



import java.util.*;
public class JavaBasics6{

    public static void main (String args[]){
        try(Scanner sc = new Scanner(System.in)){

        int year = sc.nextInt();
       
         if (year%4==0 && year%100==0 && year%400==0){
            System.out.println("Its is a leap year");
         }
         else{
            System.out.println("otherwise it's not a leap year");
         }
         sc.close();
        }
    }
}