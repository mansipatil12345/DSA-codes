// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*; //it imports all methods 
public class sort {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        Collections.sort(list);
        System.out.print(list); //ascending

        Collections.sort(list,Collections.reverseOrder());  //descending order
        //collections.reverseOrder()->it is a comparator is a function which defines the logic how to do the sorting 

        //objects par bhi apply kar sakte hai

        System.out.print(list);
    }
}
