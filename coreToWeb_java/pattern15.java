public class pattern15 {
    public static void main(String args[]){
        int num=1;

        for(int i=1;i<=5;i++){

            for(int j=1;j<=i;j++){
                if(num==2||num==5||num==9||num==14){
                    num++;
                }
                System.out.print(num+" ");
                num++;
            }
            System.out.println();

        }
    }
}
