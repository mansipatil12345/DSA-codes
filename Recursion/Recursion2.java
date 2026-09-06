public class Recursion2{
    public static void printNumbers(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printNumbers(n-1);
        System.out.println(n);   
    }

    public static int factorial(int n){
        if(n==1){
            return n;
        }
        int factnm1 = factorial(n-1);
        int fact = n * factnm1;
        return fact;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sumnm1 = sum(n-1);
        int sum = n+sumnm1;
        return sum;
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibN = fibnm1 + fibnm2;
        return fibN;
    }

    public static boolean arrayIsSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return arrayIsSorted(arr, i+1);
    }

    public static int firstoccurence(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurence(arr, i+1,key);
    }

    public static int lastOccurrance(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int found = lastOccurrance(arr, i+1, key);

        if(arr[i]==key && found==-1){
            return i;
        }

        return found;
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static int optimizedpower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower= optimizedpower(x, n/2);
        int halfpowersq = halfpower*halfpower;
        
        if(n%2!=0){
            halfpowersq = x*halfpowersq;
        }

        return halfpowersq;
    }

    public static void main(String args[]){
        // int n = 10;
        // printNumbers(n);
        // int arr[]={8,3,6,9,5,10,2,5,3};
        // System.out.println(factorial(5));
        // System.out.println(sum(3));
        // System.out.println(fibonacci(5));
        // System.out.println(arrayIsSorted(arr, 0));
        // System.out.println(firstoccurence(arr, 0, 5));
        // System.out.println(lastOccurrance(arr, 0, 5));
        // System.out.println(power(2,5));
        System.out.println(optimizedpower(2,5));
    }
}