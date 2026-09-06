// public class Duplicate_Problem {
//     public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
//         if(idx==str.length()){
//             System.out.println(newStr);
//             return;
//         }

//         char currChar=str.charAt(idx);
//         if(map[currChar-'a']==true){
//             removeDuplicates(str,idx+1,newStr,map);
//         }
//         else{
//             //agar pehle se its not present in map array then map array me jakar usko true karo and new str me append kardo 
//            map[currChar-'a']=true;
//            removeDuplicates(str,idx+1,newStr.append(currChar),map);
//         }
//     }
//     public static void main(String args[]){
        
//         String str="appnnacollege";
//         removeDuplicates(str,0,new StringBuilder(""),new boolean [26]);
//     }
// }


public class Duplicate_Problem{
    public static void removeDuplicates(String str,int indx,StringBuilder newstr,boolean map[]){
        if(indx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(indx);
        if(map[currchar-'a']==true){
            removeDuplicates(str,indx+1,newstr,map);
        }
        else{
            map[currchar-'a']=true;
            removeDuplicates(str,indx+1,newstr.append(currchar),map);
        }
       
    }
    public static void main(String[] args) {
        String str="appnnacollege";
       removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}