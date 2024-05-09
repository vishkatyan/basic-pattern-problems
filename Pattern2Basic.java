public class Pattern2Basic {
    // This is basic pattern 2
    /* o
       00
       000
       0000
     */
    public static void Pattern2(){
        for(int i=0;i<=3;i++){
            for(int j=0; j<=i;j++){
                System.out.print(0);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Pattern2();
    }
}
