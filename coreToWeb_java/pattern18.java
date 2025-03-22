public class pattern18 {
    public static void main(String args[]){
        int num=1,j;
        for(int i=1;i<=4;i++){
            for( j=1;j<=i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
            num=num-j+2;
        }
    }
}
