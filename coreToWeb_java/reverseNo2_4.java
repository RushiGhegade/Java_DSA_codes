import java.util.Scanner;

public class reverseNo2_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        while(num!=0){

            System.out.println(num%10);
            num=num/10;
        }

    }
}
