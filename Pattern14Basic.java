public class Pattern14Basic {
    /*
    For n=5
    55555
    4444
    333
    22
    1
    Similarly for N=6,8,9 etc...
     */
    public static void Pattern14(int n){
        for(int i=0;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern14(5);
    }
}
