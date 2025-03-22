
//write a program to calculate factorial of n number using for loop;

import java.util.Scanner;

public class forFact {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int fact=1;

        for(int i=1;i<=x;i++){
            fact=fact*i;
        }
        System.out.println("factorial="+fact);
    }
}
