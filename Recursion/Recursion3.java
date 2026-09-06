public class Recursion3 {
    public static int tilingways(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical = tilingways(n-1);
        int horizontal = tilingways(n-2);
        int totalways = vertical + horizontal;
        return totalways;
    }


    public static void removeduplicates(String str,StringBuilder newstr,int idx,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true){
            removeduplicates(str, newstr, idx+1, map);
        }else{
            map[currchar-'a']=true;
            removeduplicates(str, newstr.append(currchar), idx+1, map);
        }
    }

    public static int friendsPairing(int n){
       if(n==1 || n==2){
            return n;
       }

       //single choice 
       int fnm1 = friendsPairing(n-1);

       //pair choice
       int fnm2 = friendsPairing(n-2);
       int pairways = (n-1)*fnm2;

       int totalways = fnm1 + pairways;

       return totalways;
    }

    public static void printBinaryString(int n,int lastPlace,String str){
       if(n==0){
        System.out.println(str);
        return;
       }

       printBinaryString(n-1, 0, str+"0");
       if(lastPlace==0){
        printBinaryString(n-1, 1, str+"1");
       }
    }

    public static void main(String args[]){
        // int n = 4;
        // System.out.println(tilingways(n));

        // String str = "appnnacollege";
        // removeduplicates(str, new StringBuilder(""),0, new boolean[26]);

        // System.out.println(friendsPairing(3));

        printBinaryString(3, 0, "");
    }
}
