public class Pattern3Basic {
    /*
    Print basic "*" rectangle
    ***** --> 0th row
    *****
    *****
    *****
     */
    public static void Pattern3(){
        for(int i=0; i<=3; i++){
            for(int j=0; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern3();
    }
}
