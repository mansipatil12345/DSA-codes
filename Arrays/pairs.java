// public class pairs {
//     public static void printpairs(int numbers[]){
//         for(int i=0;i<numbers.length;i++){
//             int current = numbers[i];
//             for(int j=i+1;j<numbers.length;j++){
//                 System.out.print("("+current+","+numbers[j]+")");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};

//         printpairs(numbers);
//     }
// }


// public class pairs {
//         public static void printpairs(int numbers[])
//         {
//             int totalpairs=0;
//             for(int i=0;i<numbers.length;i++){
                
//                 int current = numbers[i];
//                 for(int j=i+1;j<numbers.length;j++){
//                     System.out.print("("+current+","+numbers[j]+")");
//                     totalpairs++;
//                 }
//                 System.out.println();
//             }
//             System.out.println(totalpairs);
//         }
//         public static void main(String args[]){
//             int numbers[]={2,4,6,8,10};
    
//             printpairs(numbers);
//         }
//     }
    
    
// public class pairs{
//     public static void pairs(int num[]){
//         int totalpairs = 0;
//         for(int i=0;i<num.length;i++){
//             int curr = num[i];
//             for(int j=i+1;j<num.length;j++){
//                 System.out.print("("+curr+","+num[j]+")");
//                 totalpairs++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total pairs: "+totalpairs);
//     }
//     public static void main(String args[]){
//         int num[]={2,4,6,8,10};
//         pairs(num);
//     }
// }