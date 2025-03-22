
//perfect squar number


import java.util.Scanner;

public class perfectSquar_6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number which you want to find perfect number:");
        int num=sc.nextInt();
        int i=1;
        while(i*i<=num){
            System.out.println(i*i);
            i++;

        }
    }
}
