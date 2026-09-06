// M1:
// public class prime {
    
// public static boolean isPrime(int n){


//     if(n==2){
//         System.out.print("true");
//     }
//          boolean isPrime = true;
//          for (int i = 2;i<=n-1;i++){
//            if (n%i==0){
//             isPrime=false;
//             break;
//            }
//          }
//          return isPrime;
// }

// public static void main(String[] args) {
//      System.out.print(isPrime(8));
// }

// }




// (always use this):M2
// public class prime {
    
// public static boolean isPrime(int n){


//     if(n==2){
//         System.out.print("true");
//     }
//          boolean isPrime = true;
//          for (int i = 2;i<=Math.sqrt(n);i++){
//            if (n%i==0){
//             isPrime=false;
//             break;
//            }
//          }
//          return isPrime;
// }

// public static void main(String[] args) {
//      System.out.print(isPrime(8));
// }

// }




//prime number in range
// public class prime {
    
//     public static boolean isPrime(int n){

//                if(n==2){
//                 return  true;
//                }
            
//                for (int i = 2;i<=Math.sqrt(n);i++){
//                if (n%i==0){
//                return false;
//                }
//             }
//                return true;
//     }

//     public static void primesinrange(int n){

//       for(int i = 2;i<=n;i++){
//            if(isPrime(i)){
//             System.out.print(i+ " ");
//            }
//       }
//     }
    
//     public static void main(String[] args) {
//         primesinrange(100);
//     }
    
//     }
    





