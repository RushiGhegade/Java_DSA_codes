
//   write a java program to calculate number is prime or not

//  number is prime when its factor is 2;
//  1 is not a prime number;

import java.util.Scanner;

public class prime_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("number is prime number");
        }else{
            System.out.println("number is not prime number");
        }
    }
}
