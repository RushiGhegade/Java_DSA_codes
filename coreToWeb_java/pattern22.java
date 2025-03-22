public class pattern22 {
    public static void main(String args[]){
        int num=1,j;
        int ch=70;

        for(int i=1;i<=6;i++){
            for( j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(num+"   ");
                    num++;
                }else{
                    System.out.print(ch+"   ");
                    ch--;
                }
            }
            System.out.println();
            ch=ch+j-2;
        }
    }
}
