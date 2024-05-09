public class Pattern5Basic {
    /*
     for n=4
     1
     22
     333
     4444
     for every value of n, it;ll print upto n
     */
    public static void Pattern5(int n){
        if(n==0){
            System.out.print(0);
        }
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern5(6);
    }
}
