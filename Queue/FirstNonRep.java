// import java.util.*; //t.c is O(n)
// public class FirstNonRep {
//     public static void printNonRepeating(String str){
//         int freq[]= new int[26];
//         Queue<Character> q = new LinkedList<>();

//         for(int i=0;i<str.length();i++){ //O(n)
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;

//             while(!q.isEmpty() && freq[q.peek()-'a']>1){ //O(n) elements are coming and removing                 q.remove();
//             }
//             if(q.isEmpty()){
//                 System.out.print(-1+" ");
//             }else{
//                 System.out.print(q.peek()+" ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         String str = "aabccxb";
//         printNonRepeating(str);
//     }
// }

