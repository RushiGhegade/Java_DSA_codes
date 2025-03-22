


import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int fact=1;
//        int i=1;
        while(num>=1){
            fact =fact*num;
            System.out.print(num+" ");
            num--;
        }
        System.out.println("\nfactoral ="+fact);
    }
}
