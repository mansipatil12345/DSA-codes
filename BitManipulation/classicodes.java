public class classicodes {

    public static void oddeven(int n){
        int bitmask = 1;
        if((n & bitmask)==1){
            System.out.print("Odd");
        }
        else{
            System.out.print("Even");
        }
    }

    public static int getIthbit(int n,int i){
        int bitmask = (1<<i);
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthbit(int n,int i){
        int bitmask = (1<<i);
        return n | bitmask;
    }

    public static int clearIthbit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static boolean isPowerofTwo(int n){
        return (n&(n-1))==0;
    }
    
    public static int updateIthBit(int n,int i,int newbit){
        // if(newbit==0){
        //     return clearIthbit(n, i);
        // }
        // else{
        //     return setIthbit(n, i);
        // }

        n = clearIthbit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;
    }

    public static int clearRangeofbits(int n, int i,int j){
        int a = (~0)<<(j+1);
        int b =(1<<i)-1;

        int bitmask = a|b;
        return n & bitmask;
    }



    public static int clearIbits(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int Fastexpo(int a,int n ){
        int ans =1;
        while(n>0){
            if((n&1)!=0){
                ans = ans * a;
            }
            a = a*a;
            n= n>>1;
        }
        return ans;
    }

    public static void swap(int x,int y){
        System.out.println("The number before swapping is:"+x+"and "+y);
        x = x^y;
        y = y^x;
        x = x^y;
        System.out.println("The number after swapping is:"+x+"and "+y);
    }

    public static int add1tointeger(int x){
        return -~x;
    }

    public static char  tolowercase(char ch){
        return (char)(ch |' ');
    }

    public static void main(String[] args) {
        
        // oddeven(4);
        // System.out.println(getIthbit(5,2));
        // System.out.println(setIthbit(5,2));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIbits(14, 2));
        // System.out.println(clearRangeofbits(10, 2, 4));
        // System.out.println(isPowerofTwo(4));
        // System.out.println(countSetBits(10));
        // System.out.print(Fastexpo(5,3));
        // swap(3,4);
        // System.out.println(add1tointeger(-4));
        // System.out.println(tolowercase('C'));
    }
}



