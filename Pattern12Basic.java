public class Pattern12Basic {
    /*
    For n=5
    E
    D E
    C D E
    B C D E
    A B C D E
     */
    public static void Pattern12(){
        for(int i=4; i>=0;i--){
            for(int j=i; j<=4;j++){
                System.out.print((char)(65+j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern12();
    }
}
