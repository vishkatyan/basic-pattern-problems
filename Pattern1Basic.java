public class Pattern1Basic {
    // Basic Step is to assume every pattern in the form of a GRID.
    // Assume this pattern -->
  /*  000000
    000000
    000000
    000000
    000000 */
    public static void Pattern1(){
        // For the Rows
        for(int i=0;i<=4;i++){
            for(int j=0; j<=5; j++){
                System.out.print(0);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1();
    }
}
