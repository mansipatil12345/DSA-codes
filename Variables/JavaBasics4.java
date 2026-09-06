// Sum of two numbers

// import java.util.*;

// public class JavaBasics4{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println(sum);
//         sc.close();
//     }
// }



// product of two numbers 

// import java.util.*;

// public class JavaBasics4{
//     public static void  main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = a*b;
//         System.out.println(product);
//         sc.close();
//     }
// }


// Area of circle 

// import java.util.*;

// public class JavaBasics4{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int side = sc.nextInt();
//         int Area= side*side;
//         System.out.println(Area);
//         sc.close();
//     }
// }



// this code is also right practise q 3 vriable
// import java.util.*;

// public class JavaBasics4{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         Float pencil = sc.nextFloat();
//         Float gstpencil = pencil*18/100;
 
//         System.out.println(gstpencil);


//         Float pen = sc.nextFloat();
//         Float gstpen = pen*18/100;

//         System.out.println(gstpen);

//         Float eraser = sc.nextFloat();
//         Float gsteraser = eraser*18/100;

//         System.out.println(gsteraser);

//         Float TotalPrize = pencil + pen + eraser;
//         Float gstPrize = gstpencil + gstpen + gsteraser;

//         Float total = TotalPrize + gstPrize;


//         System.out.println(TotalPrize);
//         System.out.println(gstPrize);
//         System.out.println(total);
//         sc.close();
//     }
// }




// import java.util.*;

// public class JavaBasics4{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float pencil= sc.nextFloat();
//         float pen= sc.nextFloat();
//         float eraser= sc.nextFloat();

//         float total =pencil +pen +eraser;
//         System.out.println("Bill is = "+total);

//         float newTotal = total+ (0.18f*total);

//         System.out.println("Bill with 18% tax: " + newTotal);
//     }
// }


public class JavaBasics4 {
    public static void main(String[] args) {
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        float exp = 4.0f/ 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (float)(a + b * y);
        System.out.println(exp);
}
}       