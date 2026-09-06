// import java.util.*;

// public class HashmapImp{   //-> classes - blueprint (no memory is allocated)
//                             //-> object - memory allocate and // constructor-> same name like class and automatically 
//                                                     //->runs when object is created (used to initialize the variables) 
//     static class HashMap<K,V>{  //->static - independent of outer class 
//                                 //->non static - dependent of outer class
//         //object1 created 
//         private class Node{
//             K key;
//             V value;
//             //constructor created for the object
//             public Node(K key, V value){
//                 this.key = key;
//                 this.value = value;
//             }
//         }
//         //object2 created
//         private int n; //size of nodes
//         private int N; //size of buckets[]
//         //object3 created 
//         private LinkedList<Node> buckets[]; 

//         //constructor 
//         @SuppressWarnings("unchecked")  //-> to avoid the type and warning which does allow generic type creation
//         public HashMap(){
//             this.N=4;
//             this.buckets=new LinkedList[4];
//             for(int i=0;i<4;i++){
//                 this.buckets[i]=new LinkedList<>();
//             }
//         }   
//         @SuppressWarnings("unchecked") 
//         private void rehash(){
//             LinkedList<Node> oldBuck[]= buckets;            //bucket ko khali karke store in oldbuck
//             buckets = new LinkedList[N*2];              //then bucket ka size double karo
//             N = 2*N;                                    //make N as 2*N
//             for(int i=0;i<buckets.length;i++){          //fill bucket again after resizing
//                 buckets[i] = new LinkedList<>();
//             }

//             //nodes -> add in bucket
//             for(int i=0;i<=oldBuck.length;i++){
//                 LinkedList<Node> ll = oldBuck[i];  //travers to old bucket and then ll at each index then ontravering to each el of ll get the node and then put in new buck
//                 for(int j=0;j<ll.size();j++){
//                     Node node = ll.get(j);
//                     put(node.key,node.value);
//                 }
//             }
//         }

//         private int hashfunction(K key){
//             int hc = key.hashCode();              //->hashcode converts and returns int (any +ve,-ve) for the input object
//             return Math.abs(hc) % buckets.length;                         //->absolute will give the -ve to +ve (if hashcode is -ve)
//                                                 //taking % with size returns hashcode in range 0 to size-1 (eg any num % 4 = remainder is in range(0-3))
//         }

//         private int SearchInLL(K key,int bi){
//             LinkedList<Node> ll = buckets[bi];      //store the linkedlist of  buckets[bi] in ll 
//             int di=0;                               //keeps the track of index n ll where data is matched to key passed as an input 

//             //loop on ll for seraching the key
//             for(int i=0;i<ll.size();i++){
//                 Node node  = ll.get(i);
//                 if(node.key==key){
//                     return di;
//                 }
//                 di++;
//             }
//             return -1;
//         }

//         public void put(K key, V value){
//             int bi = hashfunction(key);     //bi-> bucket index should in between (0 to size-1) but hashcode could be random 
//             int di = SearchInLL(key,bi);     //valid->returns index where key is present  
//                                             //or -1 -> if not present
//             if(di!=-1){
//                 Node node = buckets[bi].get(di);        //if key is already present that means !=-1 then go to bi in buckets[] then get its index (di) and sore in node
//                 node.value=value;                       //then update the value
//             }else{
//                 buckets[bi].add(new Node(key,value));   //new node is added if key is not found
//                 n++;                                 
//             }

//             double lambda = (double)n/N;                //to store the lambda value (double) type cast to store the decimal value
//             if(lambda>2.0){                             //set threshold to 2.0 for instance
//                 rehash();
//             }
//         }

//         public boolean containsKey(K key){

//             int bi = hashfunction(key);     
//             int di = SearchInLL(key,bi);      
                                            
//             if(di!=-1){   //valid
//               return true;
//             }else{
//                return false;                  
//             }  
//         }

//         public V remove(K key){
//             int bi = hashfunction(key);     //bi-> bucket index should in between (0 to size-1) but hashcode could be random 
//             int di = SearchInLL(key,bi);     //valid->returns index where key is present  
//                                             //or -1 -> if not present
//             if(di!=-1){
//                 Node node = buckets[bi].remove(di);  
//                 n--;      
//                 return node.value;                    
//             }else{
//                return null;                               
//             }
//         }

//         public V get(K key){
//             int bi = hashfunction(key);     
//             int di = SearchInLL(key,bi);     
                                            
//             if(di!=-1){
//                 Node node = buckets[bi].get(di);       
//                 return node.value;                     
//             }else{
//                 return null;                              
//             }
//         }

//         public ArrayList<K> keySet(){
//             ArrayList<K> keys = new ArrayList<>();
//             for(int i=0;i<buckets.length;i++){
//                 LinkedList<Node> ll= buckets[i];
//                 for(Node node : ll){
//                     keys.add(node.key);
//                 }
//             }
//             return keys;
//         }
//     }
//     public static void main(String[] args) {
//         HashMap<String , Integer> hm = new HashMap<>();
//         hm.put("India",100);
//         hm.put("China",120);
//         hm.put("US",50);
//         hm.put("Nepal",5);

//         ArrayList<String>Keys= hm.keySet(); //this function returns arraylist so to print we stored in arraylist then print
//         for(String key: Keys){
//             System.out.println(key);
//         }

//         System.out.println(hm.get("India"));
//         System.out.println(hm.remove("India"));
//         System.out.println(hm.get("India"));

//     }

// }


//Very important - interivew and understanding 
import java.util.*;
public class HashmapImp{
    static class HashMap<K,V>{ //generic kor value can be any data type , so generic means 
        //we dont whether k , v is of which data type so we kep it generic that will work for every data type
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }


        private int n;//n size of nodes
        private int N; // size of bucket
        private LinkedList<Node> buckets[];//N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets= new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]= new LinkedList<>();
            }
        }
        //hashfunction
        private int hashFunction(K key){
            int hc = key.hashCode(); //hashcode -> give a hash(int can be +ve or -vw) for any object
            return Math.abs(hc)%N; //to convert -ve hash to +ve and % size so that it remains in range of 0 to size-1(for tracing index)
        }
        //Search in LL
        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        //reshash
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = N*2;
            for(int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }

            //node -> add in bucket
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key,node.value);
                }
            }
        }

 
        public void put(K key,V value){   //O(lambda) <= k -> O(1)
            //1. hashfunction-> get the bucket index
            int bi = hashFunction(key);
            //2. then Search in linked list present at that index
            int di = SearchInLL(key,bi);
            //3.if di !== -1 like we found the data index
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            //4. if rehashing is needed ?
            double lambda = (double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){ //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di!=-1){
                return true;
            }else{
                return false;
            }
        }

        public V remove(K key){   //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di!=-1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }

        public V get(K key){  //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di!=-1){
                Node node = buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        public ArrayList<K> keySet(){ 
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
    }
}