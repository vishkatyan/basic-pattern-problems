public class Pattern6Basic {
    /*
    1
    1 2
    1 2 3
    1 2 3 4
     */
    public static void Pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Pattern6(5);
    }
}
