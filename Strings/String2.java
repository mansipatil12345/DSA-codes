
// import java.util.*;

// public class String2 {

    
//     public static void lowercasevowels(String str){

//         int count = 0;
//         for (int i = 0; i < str.length(); i++) 
//         {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
//             {
//                 count++;
//             }
//         }
//         System.out.println("count of vowels are : " + count);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();
//         lowercasevowels(str);
//     }
// }

// //hello everyone


//race or care
import java.util.Arrays;

public class String2{

    public static void anagrams(String str1,String str2){

        str1 = str1.toLowerCase();
        str2=  str2.toLowerCase();

        if(str1.length()==str2.length()){
            char str1array[]= str1.toCharArray();
            char str2array[]= str2.toCharArray();

            Arrays.sort(str1array);
            Arrays.sort(str2array);

            boolean result=Arrays.equals(str1array,str2array);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            }
            else{
                 System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        }
        else{
             System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        }
    

    public static void main(String[] args) {
        String str1="race";
        String str2="care";
       anagrams(str1,str2);
    }

}