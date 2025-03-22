public class pattern14 {
    public static void main(String args[]){
        int ch=74;

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
