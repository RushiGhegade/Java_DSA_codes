
import java.util.Scanner;

class armstrong_num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rem, num=sc.nextInt();
        int temp=num;
        int temp1=num;
        int sum=0;
        int count=0;

        while(temp!=0){
            count++;
            temp=temp/10;

        }

        while(num!=0){
             rem=num%10;
            int mul=1;
            for(int i=1;i<=count;i++){
                mul=mul*rem;
            }
            num=num/10;
            sum=sum+mul;
        }

        if(sum==temp1){
            System.out.println("armstrong number:");
        }else{
            System.out.println("not armstrong number:");
        }

    }
}