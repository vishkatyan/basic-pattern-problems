public class Pattern19Basic {
    /*
    Inverted Half Pyramid
    *****
    ****
    ***
    **
    *
     */
    public static void Pattern19(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern19(5);
    }
}
