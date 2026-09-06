
// public class String1 {
//     public static void printletters(String str) {
//         for (int i = 0; i < str.length(); i++) {
//             System.out.println(str.charAt(i));
//         }
//     }
//     public static boolean Palindrome(String str) {
//         //diving into two parts and comparing last to last then second last to second last 
//         for (int i = 0; i < str.length() / 2; i++) {
//             if (str.charAt(i) != str.charAt(str.length() - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static float getShortestPath(String path) {
//         int x = 0, y = 0;
//         for (int i = 0; i < path.length(); i++) {
//             char dir = path.charAt(i);
//             //South
//             if (dir == 'S') {
//                 y--;
//             } else if (dir == 'N') {
//                 y++;
//             } else if (dir == 'E') {
//                 x++;
//             } else {
//                 x--;
//             }
//         }
//         int X2 = x * x;
//         int Y2 = y * y;
//         return (float) Math.sqrt(X2 + Y2);
//     }
//     public static String substring(String str, int si, int ei) {
//         String substr = "";
//         for (int i = si; i < ei; i++) {
//             substr += str.charAt(i);
//         }
//         return substr;
//     }
//     public static void main(String args[]) {
//         //creating new String
//         Scanner sc = new Scanner(System.in);
//         //  String str="racecar";
//         // String path="WNEENESENNN";
//         // String name=sc.nextLine();
//         // System.out.println(name);
//         //concatenation
//         // String firstName="mansi";
//         // String LastName="Patil";
//         // String FullName=firstName+""+LastName;
//         // System.out.println(FullName);
//         //to extract each word -charAt
//         // System.out.println(FullName.charAt(1));
//         // printletters("Mansi");
//         // System.out.println(Palindrome("racecar"));
//         // System.out.println(getShortestPath(path));
//         //.equals();
//         // String s1="Tony";
//         // String s2="Shark";
//         // String s3= new String("Tony");
//         // // if(s1==s3){
//         // //     System.out.println("s1 and s3 are equal");
//         // // }
//         // // else{
//         // //      System.out.println("s1 and s3 are not equal");
//         // // }
//         // if(s1.equals(s3)){
//         //     System.out.println("s1 and s3 are equal");
//         // }
//         // else{
//         //      System.out.println("s1 and s3 are not equal");
//         // }
//         // String str="HelloWorld";
//         // System.out.println(substring(str,0,5));
//         // //alternative
//         // System.out.println(str.substring(0,5));
//         String fruits[] = {"apple", "mango", "banana"};
//         // String largest = fruits[0];
//           String smallest = fruits[0];
//         for (int i = 1; i < fruits.length; i++) {
//             // if (largest.compareTo(fruits[i])< 0) {
//             //     largest = fruits[i];
//             // }
//             if (smallest.compareTo(fruits[i])> 0) {
//                 smallest = fruits[i];
//             }
//         }
//         // System.out.println(largest);
//         System.out.println(smallest);          
//     }
// }
//String builder
// public class String1{
//     public static String toUppercase(String str){
//     StringBuilder sb= new StringBuilder("");
//     char ch=Character.toUpperCase(str.charAt(0));
//     sb.append(ch);
//     for(int i=1;i<str.length();i++){
//         if(str.charAt(i)==' ' && i<str.length()-1){
//             sb.append(str.charAt(i));
//             i++;
//             sb.append(Character.toUpperCase(str.charAt(i)));
//         }
//         else{
//             sb.append(str.charAt(i));
//         }
//     }
//     return sb.toString();
// }
//     public static void main(String[] args) {
//         // StringBuilder sb= new StringBuilder("");
//         // for(char ch='a';ch<='z';ch++){
//         //     sb.append(ch);
//         // }
//         // System.out.println(sb);
//         //for a given string convert each the first letter of each word to uppercase
//         String str="hii, i am shradha";
//         System.out.println(toUppercase(str));
//     }
// }


//string compression
public class String1 {

    // public static String compression(String str){
    //     String newstr="";
    //     Integer count=1;

    //     for(int i=0;i<str.length();i++){
    //         while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
    //         newstr+=str.charAt(i);
    //         if(count>1){
    //             newstr+=count.toString();
    //         }
    //     }
    //     return newstr;
    // }

    public static String compression(String str){
        StringBuilder newstr =  new StringBuilder("");
       

        for(int i=0;i<str.length();i++){
             Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count>1){
                newstr.append(count.toString());
            }
        }
        return newstr.toString();
     }
    

    public static void main(String[] args) {
        String str = "aaabbccdd";
        System.out.println(compression(str));
    }
}

