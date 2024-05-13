public class Pattern13Basic {
    /* For n=4, similarly print for n=6,7,8.....
         1
       1 2
     1 2 3
   1 2 3 4
     */
    public static void Pattern13(int n){
        for(int i=1; i<=n;i++){
        // To print spaces
            for (int j=n-i-1; j>=0; j--){
                System.out.print(" ");
            }
//          To print numbers
            for(int j=1; j<i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Pattern13(4);
    }
}
