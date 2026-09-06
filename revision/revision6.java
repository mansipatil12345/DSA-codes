// // //permutation in string 
// // //kabhi bhi agar question permutation se related so remeber combination matlab no of char + frequency of char same hoti hai matab ab hai toh a and b ek-ek baar hi ayenge jaise cobination will be ab , ba that's it !!

// // // (apporach 1 - integer array)
// // //question me humesha look at the cinstrants vaha given hai lowercase so char sirf 'a'-'z'that means sirf 26 possible charater ho sakte hai 
// // // (approach2-hashmap)
// // //for future it can also give uppercase , lowercase other character toh yeh question hash map se hoga 
// // //approach 1-
// // //step1-freq store
// // //step-2 s1.length ki window ki frequency ko check karenge (sliding window approach)
// // public class revision6{
// //     public static boolean isFreqSame(int freq1[],int freq2[]){
// //         for(int i=0;i<26;i++){
// //             if(freq1[i]!=freq2[i]){
// //                 return false;
// //             }
// //         }
// //         return true;
// //     }
// //     public static boolean checkInclusion(String s1,String s2){
// //         int freq[]=new int[26]; //array created
// //         for(int i=0;i<s1.length();i++){
// //             freq[s1.charAt(i)-'a']++;
// //         }
// //         int windowsize=s1.length();
// //         for(int i=0;i<s2.length();i++){
// //             int windidx=0,idx=i;
// //             int windFreq[]=new int[26];
// //             while(windidx<windowsize && idx<s2.length()){
// //                 windFreq[s2.charAt(idx)-'a']++;
// //                 windidx++;
// //                 idx++;
// //             }
// //             if(isFreqSame(freq,windFreq)){
// //                 return true;
// //             }
// //         }
// //         return false;
// //     }
// //     public static void main(String[] args) {
// //         String s1="ab";
// //         String s2="eidbaooo";
// //         System.out.print(checkInclusion(s1,s2));
// //     }
// // }
// public class revision6{
//     public static int compress(char chars[]){
//         int n=chars.length;
//         int idx=0;
//         for(int i=0;i<chars.length;){
//             char ch=chars[i];
//             Integer count=0;
//             while(i<n && chars[i]==ch){
//                 count++;
//                 i++;
//             } 
//             if(count==1){
//                 chars[idx++]=ch;
//             }else{
//                 chars[idx++]=ch;
//                 String str=count.toString();
//                 for(char c:str.toCharArray()){  
//                     chars[idx++]=c;
//                 }
//             }
//         }
//         return idx;
//     }
//     public static void main(String[] args) {
//         char chars[]={'a','a','a','b','b','b','c','c'};
//         System.out.print(compress(chars));
//     }
// }
// public class revision6{
//     public static boolean palindrome(String str){
//         String newstr=str.toLowerCase().replaceAll("[^a-z0-9]","");
//         for(int i=0;i<newstr.length()/2;i++){
//             if(newstr.charAt(i)!=newstr.charAt(newstr.length()-i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String str="A man, a plan,a canal:Panama";
//         System.out.print(palindrome(str));
//     }
// }
// import java.util.Arrays;
// public class revision6{
//     public static boolean Anagram(String s,String t){
//          s=s.toLowerCase();
//         t=t.toLowerCase();
//         if(s.length()==t.length()){
//               char str1chararr[]=s.toCharArray();
//               char str2chararr[]=t.toCharArray();
//                 Arrays.sort(str1chararr);
//                 Arrays.sort(str2chararr);
//                 boolean result =Arrays.equals(str1chararr,str2chararr);
//                 if(result){
//                    return true;
//                 }
//                 else{
//                     return false;
//                 }
//         }else{
//           return false;
//         }
//     }
//     public static void main(String[] args) {
//         String s="anagram";
//         String t="nagaram";
//         System.out.print(Anagram(s,t));
//     }
// }




// public class revision6 {

//     public static int compress(char chars[]) {
//        int idx=0;
//        for(int i=0;i<chars.length;){
//             char ch=chars[i];
//             Integer count=0;
//             while(i<chars.length && chars[i]==ch){
//                 count++;
//                 i++;
//             }
//             if(count==1){
//                 chars[idx++]=ch;
//             }
//             else{
//                 chars[idx++]=ch;
//                 String str=count.toString();
//                 for(char c:str.toCharArray()){
//                     chars[idx++]=c;
//                 }
//             }
//        }
//        return idx;
//     }

//     public static void main(String args[]) {
//         char chars1[]={'a','a','a','b','b','b','c','c'};
//         char chars2[]={'a'};
//         char chars3[]={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
//         System.out.print(compress(chars1));
//         System.out.print(compress(chars2));
//         System.out.print(compress(chars3));
        
//     }
// }

