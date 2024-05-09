public class Pattern4Basic {
    /*
    // Hollow Rectangle
    ***** --> 0th Row
    *   * --> 1st Row
    *   * --> 2nd Row
    ***** --> 3rd Row
     */
    public  static void Pattern4(){
        for(int i=0; i<=3; i++){
            for(int j=0; j<=4; j++){
                if(i==0 || i==3 || j==0 ||j== 4){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern4();
    }
}
