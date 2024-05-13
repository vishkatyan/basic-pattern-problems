public class Pattern15Basic {
    /*
        1
       232
      34542
     4567654
     */
    public static void Pattern15(int n){
        for(int i=0;i<n;i++){
            // To Print Spaces
            for(int j=0; j<n-i-1;j++){
                System.out.print(".");
            }
            //To Print Increasing Order
            for(int j=i+1; j<=2*i+1;j++){
                System.out.print(j);
            }
            // To Print in Decreasing Order
            for(int j=2*i;j>=i+1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern15(5);
    }
}
