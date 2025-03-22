//pelindeom number= rev==num is pelindreom number
//eg
// 121;
//rev=121   / number is pendreom;

import java.util.Scanner;

public class pendreomNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rem=0;
        for( ;num!=0;num=num/10){
            rem=rem*10;
            rem=rem+num%10;

        }

        if(rem==temp){
            System.out.println("pelindreom number:");
        }else{
            System.out.println("not pelindreom number:");
        }

    }
}
