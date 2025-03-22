//write a java program to find factors of the given number;
//input=6;
//output=1,2,3,6;


import java.util.Scanner;

public class factorOfNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n total number of the factors="+count);
    }
}
