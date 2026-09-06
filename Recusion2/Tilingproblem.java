public class Tilingproblem {
    public static int tilingways(int n){
        if(n==0 || n==1){
            return 1;
        }
        // //vertical choice
        // int fnm1=tilingways(n-1);

        // //horizontal ways
        // int fnm2=tilingways(n-2);

        // int toWays=fnm1+fnm2;
        // return toWays;

        return tilingways(n-1)+tilingways(n-2);
    }
    public static void main(String args[]){
        System.out.println(tilingways(3));
    }
}
