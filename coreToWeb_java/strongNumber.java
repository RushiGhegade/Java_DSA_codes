// sum of the factor of each digit is equal to the orignal number is called perfect number:


import java.util.Scanner;

public class strongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,temp=num;

        while(num!=0){
            int fact=1;
            int rem=num%10;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("strong number:");
        }else{
            System.out.println("not strong number:");
        }
    }
}
