import java.util.*;
public class HeightTree{   //t.c -> O(n)
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // public static int height(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int lh = height(root.left);
    //     int rh = height(root.right);
    //     return Math.max(lh,rh)+1;
    // }

    // public static int count(Node root){
    //     if(root == null){
    //         return 0;
    //     }

    //     int leftcount = count(root.left);
    //     int rightcount = count(root.right);
    //     int totalcount = leftcount + rightcount + 1;

    //     return totalcount;
    // }

    // public static int sum(Node root){
    //     if(root == null){
    //         return 0;
    //     }

    //     int leftsum = sum(root.left);
    //     int rightsum = sum(root.right);
    //     int totalsum = leftsum + rightsum + root.data;

    //     return totalsum;
    // }

    // public static int diameter1(Node root){ //O(n^2)
    //     if(root == null){
    //         return 0;
    //     }

    //     int leftDiam = diameter1(root.left);
    //     int rightDiam = diameter1(root.right);

    //     int leftheight = height(root.left);
    //     int rightheight = height(root.right);

    //     int selfDiam = leftheight + rightheight +1;
    //     return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    // }


    // static class Info{
    //     int diam;
    //     int ht;

    //     public Info(int diam,int ht){
    //         this.diam = diam;
    //         this.ht = ht;
    //     }
    // }


    // public static Info diameter(Node root){
    //     if(root == null){
    //         return new Info(0,0);
    //     }
    //     Info leftInfo = diameter(root.left);
    //     Info rightInfo = diameter(root.right);

    //     int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht + rightInfo.ht+1);

    //     int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

    //     return new Info(diam,ht);
    // }

    // public static boolean isIdentical(Node node,Node subRoot){
    //     if(node==null && subRoot == null){
    //         return true;
    //     }else if(node == null || subRoot == null || node.data!= subRoot.data){
    //         return false;
    //     }

    //     if(!isIdentical(node.left, subRoot.left)){
    //         return false;
    //     }

    //     if(!isIdentical(node.right,subRoot.right)){
    //         return false;
    //     }
    //     return true;
    // }

    // public static boolean isSubtree(Node root,Node subRoot){
    //     if(root == null){
    //         return false;
    //     }
    //     if(root.data == subRoot.data){
    //         if(isIdentical(root,subRoot)){
    //             return true;
    //         }
    //     }

    //     // boolean leftAns = isSubtree(root.left, subRoot);
    //     // boolean rightAns = isSubtree(root.right, subRoot);
    //     //instead of writing this we can directly write this return statement
    //     //it checks s1 and return true s2 will not be executed otherwise s2 is checked and return the ans

    //     return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    // }

    static class Info{
        Node node;
        int hd;

        public Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        //levelOrder
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min =0,max =0;
        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){ //first time my hd is occuring
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max = Math.max(max,curr.hd+1);
                }
            }
        }

        for(int i=min ;i<=max;i++){
            System.out.print(map.get(i).data+" "); //for every index we will get the value that is node 
                                        //but we want to print data so we used node.data
        }
        System.out.println();
    }

    public static void Klevel(Node root,int level,int K){
        if(root==null){
            return;
        }

        if(level==K){
            System.out.print(root.data+" ");
            return;
        }

        Klevel(root.left, level+1, K);
        Klevel(root.right,level+1,K);
    }
  
    public static void main(String args[]){
        /*          1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
        */     
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));
        // System.out.println(diameter1(root));
        // System.out.println(diameter(root).diam);//object return ho raha hai 
                                                //so to access it use . dot operator(similarly can be done for height)


        /*                  2
                          /   \
                         4     5
        
        */

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println(isSubtree(root, subRoot));


    //    topView(root);

        int K = 3;
        Klevel(root, 1, K);

    }
}




