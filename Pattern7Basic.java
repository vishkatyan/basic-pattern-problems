public class Pattern7Basic {
    /*
    A
    B B
    C C C
    D D D D
     */
    public static void Pattern7(int alphabet){
        for(int i=0; i<alphabet; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)(65+i) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Pattern7(5);
    }
}
