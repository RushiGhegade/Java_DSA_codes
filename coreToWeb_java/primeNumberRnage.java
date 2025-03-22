// prime number range

public class primeNumberRnage {
    public static void main(String args[]){

        for(int i=1;i<=200;i++){
            int num=i;
            int fact=0;

            for(int j=1;j<=num;j++){
                if(i==50||i==100||i==150){
                    System.out.println();
                }
                if(i%j==0){
                    fact++;
                }
                if(fact>2){
                    break;
                }
            }
            if(fact==2){
                System.out.print(i+" ");
            }
        }
    }
}
