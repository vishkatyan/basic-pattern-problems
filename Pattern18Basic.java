public class Pattern18Basic {
    /*
    Print this
    For n=4
    1=1
    1+2=3
    1+2+3=6
    1+2+3+4=10
     */
    public static void Pattern18(int n){
        for(int i=0;i<n;i++){
            int sum =0;
            // Left Part before '='
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
                if(j<i+1){
                    System.out.print("+");
                }
                sum+=j;

            }
            // Right Part from '='
            System.out.println("=" + sum);

        }

    }
    public static void main(String[] args) {
        Pattern18(4);
    }
}
