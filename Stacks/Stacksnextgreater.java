import java.util.*;
public class Stacksnextgreater {
    public static void main(String[] args) { //t.c-> O(n), s.c-> O(n)
        int arr[]={6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[]= new int [arr.length];

        for(int i=arr.length-1;i>=0;i--){ //backward loop to track the right elements ->O(n)
            //1 while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){ //remeber we are storing   -> O(n)
                                                //indexs in stack not el and in nextgreater arr
                                                //we are storing elements
                s.pop();                        //total push=O(n) and total pop=O(n) -> O(n)+O(n)=O(n)
            }
            //2 if-else
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }

            //push the ele in arr
            s.push(i);
        }

        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}

//next greater -> right
//next greater -> left   change condition -> traverse from left i=0 to end 
//next smallest -> right  change condition -> larger el ko pop karo
//next smallest -> left