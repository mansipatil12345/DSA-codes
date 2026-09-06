// public class OPPS {
//     public static void main(String args[]){
//         // Pen p1=new Pen();   //created a pen object called p1
//         // p1.setColor("Blue");
//         // System.out.println(p1.getColor());
//         // p1.settip(5);
//         // System.out.println(p1.getTip());

//     // BankAccount myAcc = new BankAccount();
//     // myAcc.username = "shradhaKhapra";
//     // myAcc.setPassword("abscdefghi");
//     // System.out.print(myAcc.username);
        
// // constructor are created 
// // if you want to create construct s1 without initialization then you have to remove all the constructors 

//         // Student s1=new Student();
//         // Student s2 = new Student("sharddha");
//         // Student s3=new Student(1230);


//         // Student s4 = new Student ("aman",123);//this will  give error because we donot have constructor with parameters as name and rollno both 

//         Student s1= new Student();
//          s1.name="shradhha";
//          s1.rollno=1234;

//          s1.marks[0]=100;
//          s1.marks[1]=80;
//          s1.marks[2]=70;
        
//          //copying 
//         Student s2= new Student(s1);
//         s1.marks[2]=100;
//         for(int i=0;i<3;i++){
//             System.out.println(s2.marks[i]);
//         }
//     }
// }

// // class Pen{
// //     private String color;
// //     private int tip;
    


// //     //setting getters and setters 
// //     String getColor(){
// //         return this.color;
// //     }

// //     int getTip(){
// //         return this.tip;
// //     }
    
// //     void setColor(String newColor){
// //         this.color=newColor;
// //     }

// //     void settip(int newTip){
// //         this.tip=newTip;
// //     }

    
// // }


// // class BankAccount{
// //     public String username;
// //     private String password;
// //     public void setPassword(String pwd){
// //         password = pwd;
// //     }
// // }



// class Student{
//    String name;
//    int rollno;
//    int marks[];

//    //copy constructor 
//     Student(Student s1){
//         marks=new int[3];
//         this.name = s1.name;
//         this.rollno=s1.rollno;

//          //shallow copy constructor
//         //storing s1 marks 
//         // this.marks=s1.marks;
//         // this.marks=s1.marks;
//         // this.marks=s1.marks;

//         //this will copy the changes as well which are done in s1 into s2

//         //hence we will use deep constructor 

//        //deep copy constructor 
//         for(int i=0;i<marks.length;i++){
//             this.marks[i]=s1.marks[i];
//         }//values is getting copied one by one
//     }

//    Student(){
//     marks = new int[3];
//     System.out.println("constructor is called ....");
//    }

//    Student(String name){
//     marks = new int[3];
//     this.name =name;
//    }

//    Student(int rollno){
//     marks = new int[3];
//     this.rollno =rollno;
//    }

// }



// //inheritance 
// public class OPPS {
//     public static void main(String args[]){
//         // Fish shark = new Fish();
//         // shark.eat();

//         // Dog dobby = new Dog();
//         // dobby.eat();
//         // dobby.legs=4;
//         // System.out.println(dobby.legs);

//         Bird Pigeon = new Bird();
//         Pigeon.eat();

//     }    
// }


// //Base class
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// //Derived class /subclass 
// // class Fish extends Animal{
// //     int fins;
// //     void swim(){
// //         System.out.println("Swims in water");
// //     }
// // }


// class Mammals extends Animal{
//         void walk(){
//             System.out.println("walks");
//         }
// }

// // class Dog extends Mammals{
// //     String breed;
// // }

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }


// class Bird extends Animal{
//     void fly(){
//         System.out.println("fly");
//     }
// }



// hybrid inheritance 
// public class OPPS {
//     public static void main(String args[]){
//        Dog d = new Dog();
//        System.out.println("Dog");
//        d.eat();
//        d.breathe();
//        d.walk();


//        Shark s = new Shark();
//        System.out.println("\nshark");
//        s.eat();
//        s.breathe();
//        s.swim();
    
//     }    
// }


// //Base class
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }



// class Mammals extends Animal{
//         void walk(){
//             System.out.println("walks");
//         }
// }


// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }


// class Bird extends Animal{
//     void fly(){
//         System.out.println("fly");
//     }
// }


// class Shark extends Fish{
//     int teeth;
// }


// class Peacock extends Bird{
//     void colors_in_feathers(){
//         System.out.println("have 18 different typs of colors ");
//     }
// }

// class Dog extends Mammals{
//     void barks(){
//         System.out.println("wolf!!!");
//     }
// }


//polymorphism

// public class OPPS {
//     public static void main(String args[]){
//         // Calculator calc = new Calculator();
//         // System.out.println(calc.sum(1,2));
//         // System.out.println(calc.sum((float)1.5,(float)2.5));
//         // System.out.println(calc.sum(1,2,3));

//         Deer d = new Deer();
//         d.eat();

//     }    
// }

// //method overloading - same name but diff paramter 
// // class Calculator{
// //     int sum (int a,int b){
// //         return a+b;
// //     }

// //     float sum (float a , float b){
// //         return a+b;
// //     }

// //     int sum(int a,int b,int c){
// //         return a+b+c;
// //     }
// // }


// //method overriding - same name but different defination similar to inheritance 

// class Animal {
//     void eat(){
//         System.out.println("eats anything");
//     }
// }

// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass");
//     }
// }



//Abstraction

// public class OPPS {
//     public static void main(String args[]){
//         // Horse h = new Horse();
//         // h.eat();
//         // h.walk();
//         // System.out.println(h.color);

//         // Chicken c = new Chicken();
//         // c.eat();
//         // c.walk();

//         //just making object to see the hierarchy how the constructors are called
//         Mustang myHorse = new Mustang();
        
//         // Animal -> Horse -> Mustang
//     }
// }

// abstract class Animal{
//     //creating  a constructor in class 
//     String color;

//     Animal(){
//         // color="brown";
//         System.out.print("animal constructor is called...");
//     }
//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.print("horse constructor is called ...");
//     }
    
//     void changecolor(){
//         color="Yellow";
//     }
//     void walk(){
//         System.out.print("walks on 4 legs");
//     }
// }

// class Mustang extends Horse{
//     Mustang(){
//         System.out.print("Mustang constructor is called...");
//     }
// }

// class  Chicken extends Animal{
//     void changecolor(){
//         color="peach";
//     }
//     void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }


//interfaces 

// public class OPPS{
//     public static void main(String args[]){
//         Queen q = new Queen();
//         q.moves();
//     }
// }

// interface ChessPlayer{
//     void moves();
// }

// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,digonal(in all 4 directions)");
//     }
// }

// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right");
//     }
// }

// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagonal (by one step)");
//     }
// }


//Interface implemneting Multiple inheritance 

// public class OPPS{
//     public static void main(String args[]){
//         Bear b = new Bear();
//         b.eat();
//     }
// }

// interface Herbivore{
//     void eat();
//     //can be created like this 
//     // default void eat(){
//     //System.out.println("Herbivore eats plants");
//     // }
// }

// interface Carnivore{
//     void eat();
//     // default void eat(){
//     //System.out.println("carnivore eats plants");
//     // }
// }

// class Bear implements Herbivore, Carnivore{
//     public void eat(){
//         System.out.print("Bear eats herbs and meat ");
//     }
// }






//Static keyword
// public class OPPS{
//     public static void main(String args[]){

//         Student s1= new Student();
//         s1.schoolName="xyz";

//         Student s2 = new Student();
//         // System.out.println(s2.schoolName);

//         Student s3 = new Student();
//         s3.schoolName="Abc";
//         System.out.println(s2.schoolName);
//     }
// }


// class Student{
//     String name;
//     int roll;
    
//     //property Static 
//     static String schoolName;

//     //function static
//     // int calculatePercentage(int phy,int chem,int math){
//     //     return (phy+chem+math)/3;
//     // }
    
//     void setName(String name){
//         this.name = name;
//     }

//     String getName(){
//         return this.name;
//     }
// }



//super keyword 
public class OOPS{
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color="brown";
        System.out.println("Horse constructor...");
    }
}