
//composite number= the number having more than two factor is called as composite number;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("composite number:");
        }else{
            System.out.println("not composite number:");
        }

    }
}
