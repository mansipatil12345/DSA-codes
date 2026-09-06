
// //Binary to Decimal conversion 


// public class conversion {

//      public static void BintoDec (int binNum ){
     
//         int mynum = binNum;
//         int pow=0;
//         int DecNum = 0;
//         while(binNum>0)
//         {

//             int lastdigit= binNum% 10;
//             DecNum = DecNum + ( lastdigit * (int)Math.pow(2,pow));
            
//              pow++;
//              binNum =binNum /10;
//         }

//         System.out.println("Binary : "+ mynum+" , Decimal : "+ DecNum);
        
//      }

//      public static void main(String[] args) {
         
//         BintoDec(1001);
//      }

// }



//Decimal to Binary conversion


public class conversion{
  public static void DectoBin(int n){
       int myNum = n;
       int pow = 0;
       int BinN = 0;

       while(n>0)
       {
          int rem = n % 2;

          BinN= BinN + (rem * (int)Math.pow(10,pow));

          pow++;

          n =n/2;

       }
       System.out.println("Decimal is : "+ myNum + " , Binary is :" + BinN);
  }

  public static void main(String args[]){

    DectoBin(10);

  }

}