public class pattern12 {
    public static void main(String args[]){

        int num=1;

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print(num+" ");
                num++;
            }
            num=num-1;
            System.out.println();
        }

    }
}
