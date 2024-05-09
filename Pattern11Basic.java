public class Pattern11Basic {
    /*
    4
    3 4
    2 3 4
    1 2 3 4
    0 1 2 3 4
     */
    public static void Pattern11(int row){
        for(int i=row; i>=0; i--){
            for(int j=i; j<=row;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern11(6);
    }
}
