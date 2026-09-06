import java.util.*;
public class LowestCommonAncestor {
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

    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if(foundleft || foundright){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }

   

  
    public static Node lca(Node root,int n1,int n2){ //O(3n)>O(n) , but space complexity is O(n) due to arraylist  
        ArrayList<Node> path1 = new ArrayList<>(); 
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,n1,path1); //O(n)
        getPath(root,n2,path2); //O(n)

        //last common ancestor
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){ //O(n)
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //last equa; node -> i-1th index
        Node lca = path1.get(i-1);
        return lca;
    }

    public static Node lca2(Node root,int n1,int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right,n1,n2);

        //leftlca == val and rightlca == null
        if(rightlca == null){
            return leftlca;
        }

        if(leftlca == null){
            return rightlca;
        }

        return root;
    }

    public static int lcaDist(Node root,int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDis = lcaDist(root.left, n);
        int rightDis = lcaDist(root.right,n);

        if(leftDis == -1 && rightDis == -1){
            return -1;
        }else if(leftDis == -1){
            return rightDis+1;
        }else{ 
            return leftDis+1;
        }
    }

    public static int MinDis(Node root,int n1,int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);

        return dist1 + dist2;

    }


    // public static int KAncestors(Node root,int n,int k){
    //     if(root == null){
    //         return -1;
    //     }
    //     if(root.data == n){
    //         return 0;
    //     }

    //     int leftDis = KAncestors(root.left, n, k);
    //     int rightDis = KAncestors(root.right, n, k);

    //     if(leftDis == -1 && rightDis == -1){
    //         return -1;
    //     }

    //     int max = Math.max(leftDis,rightDis);

    //     if((max+1) == k){
    //         System.out.println(root.data);
    //     }
    //     return max+1;
    // }

    public static int KAncestors(Node root,int n ,int k){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDis = KAncestors(root.left, n, k);
        int rightDis = KAncestors(root.right, n, k);

        if(leftDis == -1 && rightDis == -1){
            return -1;
        }

        int max = Math.max(leftDis,rightDis);
        if((max+1)==k){
            System.out.println(root.data);
        }

        return max+1;
    }

    public static int transform(Node root){
        if(root == null){
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        
        root.data =newLeft + leftChild + newRight + rightChild;

        return data;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
         /*         1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
        */  

        /*    expected sum tree is:
                    27
                   / \
                  9   13
                 / \ / \
                0  0 0  0
        */  

        Node root = new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        // int n1 = 4 , n2 = 7;
        // System.out.println(lca(root,n1,n2).data);

        // System.out.println(lca2(root,n1,n2).data);

        // System.out.println(MinDis(root, n1, n2));

        // int n = 5, k =2;
        // KAncestors(root, n, k);
        transform(root);
        preorder(root);
    }
}
