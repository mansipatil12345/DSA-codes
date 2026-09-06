public class evenodd {
    public static void evenOrodd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.print("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }

    }

    public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return (n|bitmask);
    }

    public static int clearIthBit(int n,int i){
        int bitmask= ~(1<<i);
        return (n&bitmask);
    }

    public static int clearIbits(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }

    public static int clearInrange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;

        int bitmask=a|b;
        return n&bitmask;
    }

    public static boolean poweroftwo(int n){
        return (n&(n-1))==0;
    }

    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=(n>>1);
        }
        return count;
    }

    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){ //check LST
                ans = ans *a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        // evenOrodd(3);
        // evenOrodd(14);
        // System.out.print(getIthBit(15,2));
        // System.out.print(setIthBit(10,2));
        // System.out.print(clearIthBit(10,1));
        // System.out.print(clearIbits(15,2));
        // System.out.println(clearInrange(10,2,4));
        // System.out.println(poweroftwo(4));
        System.out.println(fastExpo(5,3));
    }
}
