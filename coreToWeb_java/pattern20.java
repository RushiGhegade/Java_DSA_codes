public class pattern20 {
    public static void main(String[] args) {
        int num=1,j;

        for(int i=1;i<=4;i++) {
            for ( j = 1; j <= i; j++) {
                if(j%2==0) {
                    System.out.print(num*num+"   ");
                    num++;
                }else{
                    System.out.print(num*num*num+"   ");
                    num++;
                }
            }
            System.out.println();
            num = num-j+2;
        }
    }
}
