public class Pattern17Basic {
    /*
    Parallelogram Pattern
    For n=4
    ****
     ****
      ****
       ****
       Similarly for n=5,7,9,etc...
     */
    public static void Pattern17(int n){
        // Approach -1
        //Outer loop
//        for(int i=0;i<=n-1;i++){
//            // For spaces
//            for(int j=0;j<=i-1;j++){
//                System.out.print(" ");
//            }
//            // For Stars
//            for(int k=1;k<=n;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Approach 2
        for(int i =0;i<=n-1;i++){
            for(int j=0;j<=n+i;j++){
                if(j<=i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern17(4);
    }
}
