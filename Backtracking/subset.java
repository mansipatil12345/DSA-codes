
// public class subset {

//     public static void findsubsets(String str, String ans, int i) {
//         if (i == str.length()) {
//             if (ans.length() == 0) {
//                 System.out.println("null");
//             } else {
//                 System.out.println(ans);
               
//             }
//              return;

//         }

//         //Yes choice
//         findsubsets(str, ans + str.charAt(i), i + 1);
//         //no choice
//         findsubsets(str, ans, i + 1);
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         findsubsets(str, "", 0);
//     }
// }


// public class subset{
//     public static void subset(String str,String ans,int i){

//         if(i==str.length()){
//             if(ans.length()==0){
//                 System.out.print("null");
                
//             }
//             else{
//                 System.out.print(ans+" ");
                
//             }
//             return;
//         }

//        subset(str, ans+str.charAt(i), i+1);//->yes
//        subset(str, ans, i+1);//->No
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         subset(str,"",0);
//     }
// }