public class FriendsPairing {
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice //single
    //    int fnm1= friendsPairing(n-1);

    //    //choice //pair
    //    int fnm2=friendsPairing(n-2);
    //    int pairways=(n-1)*fnm2;

    //    int totalways=fnm1+pairways;
    //    return totalways;

    //we can also do this like
    return friendsPairing(n-1)*(n-1)*friendsPairing(n-2);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(friendsPairing(n));
    }
}


