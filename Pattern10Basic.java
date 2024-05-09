public class Pattern10Basic {
    /*
    A
    B C
    C D E
    D E F G
     */
    public static void Pattern10(){
        for(int i=0; i<=4; i++){
            for(int j=i; j<=(i*2);j++){
                System.out.print((char)(65+j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern10();
    }
}
