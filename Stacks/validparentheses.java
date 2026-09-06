// import java.util.*;
// public class validparentheses {
//     public static boolean isValid(String str){
//         Stack<Character> s = new Stack<>();

//         for(int i=0;i<str.length();i++){
//             char ch= str.charAt(i);
//             if(ch=='(' || ch=='{' || ch=='['){ //opening
//                 s.push(ch);
//             }
//             else{              
//                 if(s.isEmpty()){
//                     return false;
//                 }else{
//                      //closing
//                      if((s.peek()=='(' && ch==')')
//                         || (s.peek()=='{' && ch=='}')
//                         || (s.peek()=='[' && ch==']')){
//                             s.pop();
//                      }else{
//                         return false;
//                      }
//                 }
//             }
//         }

//         if(s.isEmpty()){
//             return true;
//         }else{
//             return false;    //this case covers where only opening 
//                                 //unpaired el are left in stack
//         }


//     }
//     public static void main(String args[]){
//         String str = "(({})[]";
//         System.out.println(isValid(str));
//     }
// }