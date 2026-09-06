// // calculator;
// import java.util.*;
// public class Practice1{
//     public static void main (String args[]){
//         try(Scanner sc = new Scanner(System.in))
//         {    
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             char operator = sc.next().charAt(0);
//             switch(operator){
           
//                 case '+' -> System.out.println("Addition is :" + (a+b));
//                 case '-' -> System.out.println("sub is :" + (a-b));
//                 case '*' -> System.out.println("mul is :" + (a*b));
//                 case '/' -> System.out.println("div is :" + (a/b));
//                 case '%'-> System.out.println("rem is :" + (a%b));
//                default -> System.out.println("Error");
//             }
             
//             sc.close();
//         }
     
//     }
// }


// pos >0
// neg <0




// leap year 

// public class Practice1{
//     public static void main (String args[])
//     {
//           int year = 2024;
//           if(year % 4!=0){
//             System.out.println("no");
//           }
//           else if (year % 100==0 && year%400 !=0){
//             System.out.println("no");
//           }
//           else{
//             System.out.println("ya");
//           }
    
//             }
            
     
//     }


// sum of n num

// public class Practice1{
//     public static void main (String args[])
//     {
//           int n = 5;
//           int i = 1;
//           int sum = 0; ///intialize
//           while(i<=n){//condition
//             sum= sum +i;   //body
//             i++;//update
//           }
          
//           System.out.println(sum);
    
//             }
            
     
//     }


// pattern
// public class Practice1{
//     public static void main (String args[])
//     {
//             int n = 4;
//             for (int i = 1; i <= n ; i++){
//                 System.out.println("****");
//             }
    
//             }
            
     
//     }




// print the reverse of number 

//  public class Practice1{
//         public static void main (String args[])
//         {
//               int n = 1234;
             
             
//               while(n>0){//condition
//                 int lastdigit= n % 10;
//                 System.out.print(lastdigit);
//                 n=n/10;
//               }
              
            
        
//                 }
                
         
//         }
    
// reverse the number

//  public class Practice1{
//         public static void main (String args[])
//         {
//               int n = 1234;
//               int rev = 0;

//               while(n>0){//condition
//                 int lastdigit= n % 10;
//                 rev =(rev *10 )+lastdigit;
//                 n=n/10;
//               }
              
//               System.out.print(rev);
        
//                 }
                
         
//         }



// import java.util.*;
//  public class Practice1{
//         public static void main (String args[])
//         {
//             try(Scanner sc = new Scanner(System.in)){

//                 do{
//                     int n = sc .nextInt();
//                     if(n%10==0){
//                         continue;
//                     }
//                     System.out.println(n);
//                  }while(true);
        
//             }
             
        
//                 }
                
         
//         }




// import java.util.*;
//  public class Practice1{
//         public static void main (String args[])
//         {
//             try(Scanner sc = new Scanner(System.in)){
//                 int n = sc.nextInt();

//                   if(n==2){
//                     System.out.println("Prime");
//                 }
//                     else{
//                         boolean isPrime=true;
//                         for(int i = 2; i<= Math.sqrt(n);i++){
//                             if(n%i==0){
//                                 isPrime=false;
//                                 break;
//                             }
//                         }
//                         if(isPrime==true){
//                             System.out.println("Prime");
//                         }
//                        else{
//                         System.out.println("not Prime");
//                        }
//                      }
//                    }

//                 }
             
//             }
           



// import java.util.*;
//  public class Practice1{
//         public static void main (String args[])
//         {
//             try(Scanner sc = new Scanner(System.in)){
                

//                 int choice ;
//                 int evensum=0;
//                 int oddsum = 0;

//                  do { 
//                     int n = sc.nextInt();
                     
//                     if(n%2==0){
//                         evensum = evensum + n;
//                     }
//                     else{
//                         oddsum = oddsum + n;
//                     }
//                     System.out.println("Do you want to continue ?press 1 for yes and 0 for no");
//                     choice = sc.nextInt();
//                  } while (choice==1);
//                  System.out.println("Evensum is : "   +  evensum);
//                  System.out.println("oddsum is : "   +  oddsum);

//                    }

//                 }
             
//             }
                
         

// public class Practice1{
//     public static void main (String args[])
//     {
//           int n = 5;
//           int fact = 1;
//           int i =1;
//                       //intialize
//           while(i<=n){//condition
//             fact =fact *i;   //body
//             i++;//update
//           }
          
//           System.out.println(fact);
    
//             }
            
     
//     }


    // public class Practice1{
    //     public static void main (String args[])
    //     {
    //             int n = 5;
    //             for(int i=1;i<=10;i++){
    //              System.out.println( n + " * "  + i + " = " + n*i );

    //             }
        
    //             }
                
         
    //     }
    



    
// import java.util.*;
//  public class Practice1{
//         public static void main (String args[])
//         {
//             try(Scanner sc = new Scanner(System.in))
//             {
                
//                int n = sc.nextInt();
//                if(n%15==0){
//                 System.out.println("FizzBuzz");
//                }
//                else if (n%3==0){
//                 System.out.println("Fizz");
//                }
//                else if (n%5==0){
//                 System.out.println("Buzz");
//                }
//                else{
//                 System.out.println(n);
//                }

//             }

//         }
             
//     }
                

    
// import java.util.*;
//  public class Practice1{
//         public static void main (String args[])
//         {
//             try(Scanner sc = new Scanner(System.in))
//             {
                
//                int day = sc.nextInt();
//                int hour = sc.nextInt();
//                int minute = sc.nextInt();

//                hour += 5;
//                minute += 30;

//                 if(hour>24){
//                     day++;
//                     hour-=24;
//                 }
//                 if (minute>60) {
//                     hour++;
//                     minute-=60;
//                 }

//                 System.out.println("day : "+ day + " , hour : " + hour + ", minute: " + minute);
//             }

//         }
             
//     }
              


//  public class Practice1{
//         public static void main (String args[])
//         {
//            int n=4;
           
//            for(int i = 1; i<= n; i ++ ){
//             for(int j = 1; j<=i ;j++){
//                 System.out.print(j);
                
//             }
//             System.out.println();
//            }

//         }
             
//     }


// public class Practice1{
//     public static void main (String args[])
//     {
//        int n=4;
//        int k = 1;
       
//        for(int i = 1; i<= n; i ++ ){
//         for(int j = 1; j<=i ;j++){
//             System.out.print(k);
//             k++;
//         }
//         System.out.println();
//        }

//     }
         
// }




// import java.util.*;
// public class Practice1{
//  public static int factorial (int n )
//  {
//     int fact = 1;
//     for(int i=1;i<=n;i++){
//         fact = fact *i;
        
//     }
//     return fact;
// }

// public static int binomialcoefficient (int n , int r ){
      
//          int nfact= factorial(n);
//          int rfact = factorial(r);
//          int nmrfact = factorial(n-r);

//         int binomial = nfact/(rfact*nmrfact);
//         return binomial;
// }




//     public static void main (String args[])
//     {
//         try(Scanner sc = new Scanner (System.in)){
            
//             int n = sc.nextInt();
//             int r = sc.nextInt();

//             int binomial1 = binomialcoefficient(n,r);

//             System.out.println(binomial1);
            
//         }
// }

// }

  

// public class Practice1{
// public static boolean prime(int n ){

// if(n==2)
// {
//     return true;
// }

//     boolean isPrime = true;
// for(int i = 2;i<=Math.sqrt(n);i++)
// {
//     if(n%i==0)
//     {
//           isPrime = false;
//           break;
//     }
     
// }
//       return isPrime;

// }
//     public static void main (String args[])
//     {
       
//        System.out.println(prime(7));

//     }
         
// }


// bin to dec 


public class Practice1{
public static void DectoBin(int decNum){
    int pow=0;
    int rem =0;
    int myNum = decNum;
    while(decNum>0)
    {
      int lastdigit = decNum %2;
      rem = rem + (lastdigit * (int)Math.pow(10,pow));
      pow++;
      decNum = decNum /2;

    }
    System.out.println( "dec : " + myNum + ", bin : "+rem);
}

    

public static void main (String args[])
    {
       DectoBin(7);

}
}