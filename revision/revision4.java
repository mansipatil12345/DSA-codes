import java.util.Arrays;
public class revision4{
    public static void anagrams(String str1,String str2){

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char str1CharArray[]=str1.toCharArray();
            char str2CharArray[]=str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean results=Arrays.equals(str1CharArray,str2CharArray);

            if(results){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        anagrams(str1,str2);
    }
}