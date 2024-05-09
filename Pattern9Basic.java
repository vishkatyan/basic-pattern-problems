public class Pattern9Basic {
    /*
    0
    1 2
    2 3 4
    3 4 5 6
     */
    public static void Pattern9(){
        for(int i=0; i<=4; i++){
            for(int j=i; j<=(i*2);j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern9();
    }
}
