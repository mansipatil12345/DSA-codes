
// public class assignment {

//     public static int PrintOccurances(int n, int i, int key, int arr[]) {
//         if (n == 0) {
//             return 0;
//         }
//         if (arr[i]==key) {
//             System.out.print(i+" ");
//         }
//         PrintOccurances(n - 1, i + 1, key, arr);
        
//         return 0;
//     }

//     public static void main(String args[]) {
//         int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
//         int n = arr.length;
//         PrintOccurances(n, 0, 2, arr);
//     }
// } -> t.c O(n),s.c O(n)

// public class assignment{
//     public static void printdigits(int number,String digits[]){
//         if(number==0){
//             return;
//         }

//         int lastdigit=number%10;
//         printdigits(number/10,digits);
//         System.out.print(digits[lastdigit]+" ");
//     }
//     public static void main(String[] args) {
//         String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

       
//         printdigits(1947,digits);
//     }
// }-> t.c O(logn) s.c O(logn)  where there is a div -> complexity is O(logn) for n/2 or n/10
//-> for substraction like n-1  t.c is O(n) (explanation in notebook)



// public class assignment{   //L(n)= 1 + L(n-1)  -> length of string = 1+ length of remaining string 
//     public static int length(String str){
//         if(str.length()==0){
//             return 0;
//         }
//         return length(str.substring(1))+1;
//         //bracket should be (str.substring(1))+1 should not be covered coz it will also recurse.
//     }
//     public static void main(String[] args) {
//         String str="Hello";
//         System.out.print(length(str));
//     }
// }           //t.c -> O(n^2)  , s.c -> O(n)

// public static int length(String str, int idx){
//     if(idx == str.length()){
//         return 0;
//     }
//     return 1 + length(str, idx+1);
// }
//(this function can be used t reduce time complexity to O(n))-> coz it avoids substring

 
// public class assignment{ //-> Palindrome type problem (start and end with same character)
//     public static int countString(String str,int i,int j,int n){
//         if(n==1){
//             return 1;
//         }
//         if(n<=0){
//             return 0;
//         }

//         int res=countString(str,i+1,j,n-1)+countString(str,i,j-1,n-1)-countString(str,i+1,j-1,n-2);

//         if(str.charAt(i)==str.charAt(j)){
//             res++;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         String str="aba";
//         int n=str.length();
//         System.out.println(countString(str,0,n-1,n));
//     }
// }
//-> so at every level there are 3 recursive calls  T.C ->O(3^n) -> can optimized through DP , s.c O(n)


//tower of Hanoi
// public class assignment {
// public static void TowerofHanoi(int n, String src,String helper,String destination){
//         if(n==1){
//             System.out.println("transfer disk: "+ n + " from "+ src + " to "+ destination);
//             return;
//         }
//         TowerofHanoi(n-1, src, destination, helper);
//         System.out.println("transfer disk: "+ n + " from "+ src + " to "+ destination);
//         TowerofHanoi(n-1, helper, src, destination);  
// }

//  public static void main(String[] args) {
//         TowerofHanoi(3, "S", "H", "D");
//  }
//}  //-> T.c O(2^n) , s.c->O(n)






