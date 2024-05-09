public class Pattern8Basic {
    /*
    half Pyramid
    *
    * *
    * * *
    * * * *
     */
    public static void Pattern8(){
        for(int i=0; i<=3; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern8();
    }
}

