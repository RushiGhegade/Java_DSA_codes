import java.util.Scanner;

public class tricki {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num%2==0){
            while(num>=0){

                System.out.print(num+" ");
                num--;
            }
        }else{
            while(num>=0){
                System.out.println(num-2);
                num--;

            }
        }

    }
}
