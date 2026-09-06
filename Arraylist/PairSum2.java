import java.util.*;
public class PairSum2 {
    //Two pointer approach - O(n) since lp and rp are rotating and covering all n elements
    public static boolean pairsum(ArrayList<Integer>list,int target){
        int bp=-1; //breaking point
        //finding pivot/breaking point condition
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
               bp=i;
               break;
            }
        }
                int lp=bp+1; //smallest
                int rp=bp; //largest
                while(lp!=rp){
                    //case 1
                    if(list.get(lp)+list.get(rp)==target){
                        return true;
                    }

                    //case 2
                    if(list.get(lp)+list.get(rp)<target){
                        lp=(lp+1)%list.size();
                    }
                    //case 3
                    else{
                        rp=(list.size()+rp-1)%list.size();
                    }
                }
        return false;
    }

    public static void main(String[] args) {
        //pair sum for sorted and rotated array
        ArrayList<Integer> list= new ArrayList<>();
        //11,15,6,8,9,10 - sorted & rotated array
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.print(pairsum(list,target));

    } 
}
