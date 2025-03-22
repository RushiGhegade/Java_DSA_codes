// prime number  optimise code;


public class Break2 {
    public static void main(String args[]){


        int num=15;
        int count=0;
        int i;
        for( i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
            if(count>2){
                break;
            }
        }

        if(count==2){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
        System.out.println(i);
    }
}
