// public class Recursion{
//     public static void Decreasing(int n){
//         if(n==1){
//             System.out.println(1);
//             return;
//         }
//         System.out.print(n+" ");
//         Decreasing(n-1);
//     }

//      public static void Increasing(int n){
//         if(n==1){
//             System.out.println(1);
//             return;
//         }
//         Increasing(n-1);
//         System.out.print(n+" ");
        
//     }


//     public static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         int fnm1=fact(n-1);
//         int fn=n*fnm1;
//         return fn;
//     }

//      public static int sum(int n){
//         if(n==1){
//             return 1;
//         }
//         int snm1=sum(n-1);
//         int sum=n+snm1;
//         return sum;
//     }
//     public static int fibonacci(int n){
//         if(n==0|| n==1){
//             return n;
//         }
//         int fibnm1=fibonacci(n-1);
//         int fibnm2=fibonacci(n-2);
//         int fibn=fibnm1+fibnm2;
//         return fibn;
//     }

//    public static boolean isSorted(int arr[],int i){
//         if(i==arr.length-1){
//             return true;
//         }

//         if(arr[i]>arr[i+1]){
//             return false;
//         }

//         return isSorted(arr,i+1);
//    }

//    public static int firstOccurrance(int arr[],int key,int i){
//         if(i==arr.length){
//             return -1;
//         }

//         if(arr[i]==key){
//             return i;
//         }
//         return firstOccurrance(arr,key,i+1);
//    }

//    public static int lastOccurrance(int arr[],int key,int i){
//         if(i==arr.length){
//         return -1;
//         }

//         int isFound=lastOccurrance(arr,key,i+1);
//         if(isFound==-1 && arr[i]==key){
//             return i;
//         }
//         return isFound;
//    }

// //    public static int power(int x,int n){
// //         if(n==0){
// //             return 1;
// //         }
// //         // int xnm1=power(x,n-1);
// //         // int xn=x*xnm1;
// //         // return xn;
// //         return x*power(x,n-1);
// //    }tc-O(logn)

//    public static int optimizedpower(int a,int n){
//         if(n==0){
//         return 1;
//         }
//         int halfpower=optimizedpower(a,n/2);
//         int halfpowersq=halfpower*halfpower;

//         if(n%2!=0){
//             halfpowersq=a*halfpowersq;
//         }
//         return halfpowersq;
//    }//tc=O(logn)


//     public static void main(String[] args) {
//         // int arr[]={8,3,6,9,5,10,2,5,3};
//         // System.out.println(isSorted(arr,0));
//         // System.out.println(firstOccurrance(arr,5,0));
//         // System.out.println(lastOccurrance(arr,5,0));
//         // System.out.println(power(2,10));
//         int a=2;
//         int n=10;
//         System.out.println(optimizedpower(a,n));
//     }
// }



//revision
public class Recursion{
    public static void printNumInDec(int n){ //O(n) -> time and space 
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumInDec(n-1);
    }

    public static void printNumInInc(int n){ //O(n) -> time and space 
        if(n==1){
           System.out.println(n);
           return;
        }
        printNumInInc(n-1);
        System.out.println(n);
    }

    public static int printFactorial(int n){ //O(n) -> time and space 
        if(n==1){
            return 1;
        }
        int fnm1 = printFactorial(n-1);
        int fn = n * fnm1;
        return fn;
    }

    public static int printSum(int n){ //O(n) -> time and space 
        if(n==1){
            return 1;
        }
        int Snm1 = printSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static int CalfibonacciNum(int n){ //O(2^n) -> time and O(n) -> space 
        if(n==1 || n==0){
            return n;
        }
        int nm1 = CalfibonacciNum(n-1);
        int nm2 = CalfibonacciNum(n-2);
        int fibn = nm1 + nm2;
        return fibn;
    }

    public static boolean arrayIsSorted(int arr[],int i){ // O(n) and O(n)
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return arrayIsSorted(arr, i+1);
    }

    public static int firstoccurence(int arr[],int key,int i){ //O(n) and O(n)
        
       if(i==arr.length){
        return -1;
       }

       if(arr[i]==key){
        return i;
       }

       return firstoccurence(arr, key, i+1);
    }

    public static int lastOccurrance(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }

        int isFound = lastOccurrance(arr, i+1, key);
        if(isFound==-1 && arr[i]==key){
            return i;
        }

        return isFound;
    }
    public static int power(int x,int n){ //O(n) -> n getting decreased to eg 5 to -1 which is a time taking process
        if(n==0){
            return 1;
        }
     
        return x * power(x,n-1);
    }

    //optimized one
    public static int poweroptimized(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower = poweroptimized(x, n/2);
        int halfpowersq = halfpower * halfpower;

        if(n%2!=0){
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String args[]){
        // int n = 5;
        int arr[] ={1,3,2,4,2};
        // printNumInDec(n);
        // printNumInInc(n);
        // System.out.println(printFactorial(n));
        // System.out.println(printSum(n));
        // System.out.println(CalfibonacciNum(n));
        // arrayIsSorted(arr, 0);
        // System.out.println(firstoccurence(arr, 5, 0));
         System.out.println(lastOccurrance(arr,0,2));
    }
}

