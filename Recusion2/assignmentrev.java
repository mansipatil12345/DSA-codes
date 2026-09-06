public class assignmentrev{
    public static void findOccurrences(int arr[],int key,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        findOccurrences(arr, key, idx+1); 
    }

    public static void printdigits(int number,String digits[]){
        if(number==0){
            return;
        }

        int lastdigit = number%10;
        printdigits(number/10, digits);
        System.out.println(digits[lastdigit]);
    }
   

    public static int length(String str){
        if(str.length()==0){
            return 0;
        }

        return 1 + length(str.substring(1));
        //L(n)-> 1 + L(n-1);
    }

    public static int countString(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }

        if(n<=0){
            return 0;
        }

        int res = countString(str, i+1, j, n-1) + countString(str, i, j-1, n-1) -countString(str,i+1,j-1,n-2);
        //inclusion - exclusion problem

        if(str.charAt(i)==str.charAt(j)){
            res++;
        }

        return res;
    }

    public static void TowerofHanoi(int n, String src,String helper,String destination){
        if(n==1){
            System.out.println("transfer disk: "+ n + " from "+ src + " to "+ destination);
            return;
        }
        TowerofHanoi(n-1, src, destination, helper);
        System.out.println("transfer disk: "+ n + " from "+ src + " to "+ destination);
        TowerofHanoi(n-1, helper, src, destination);   //-> T.c O(2^n) , s.c->O(n)
    }

    public static void main(String args[]){
        // int arr[]={3,2,4,5,6,2,7,2,2};
        // int key =2;

        // findOccurrences(arr, key, 0);

        // String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        // printdigits(1947, digits);

        // System.out.print(length("Hello"));

        // String str="abcab";
        // int n = str.length();
        // System.out.println(countString(str, 0,n-1,n));

        TowerofHanoi(3, "S", "H", "D");
    }
}
