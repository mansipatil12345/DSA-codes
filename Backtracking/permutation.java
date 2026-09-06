// public class permutation {
//     public static void findPermutation(String str,String ans){

//          if(str.length()==0){
//                 System.out.println(ans);
//                 return;
//             }
//         for(int i=0;i<str.length();i++){
//             char curr=str.charAt(i);
//             //"abc"->c ko remove karna chaho "ab"
//             String newstr=str.substring(0,i)+ str.substring(i+1,str.length());
//             findPermutation(newstr,ans+curr);
//         }    
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         findPermutation(str,"");
//     }
// }

