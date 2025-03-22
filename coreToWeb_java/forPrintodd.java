//print odd digit from 1-6 using for loop

import java.util.Scanner;

public class forPrintodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=sc.nextInt();
//        int var=0;
        for(int i=0;i<=x;i++){
            if(i%2==1){
//                var=var*10+i;
                System.out.println(i+" ");
            }
        }
//        System.out.println(var);
    }
}
