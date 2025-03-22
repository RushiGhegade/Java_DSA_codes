//    write a program to check number is perfect or not ;

//    perfect a number =addition of the factors of this number is equal to  origanal number but factors is less then this num
//eg
// 6
//  factors = 1, 2, 3,(less it's self) =1+2+3=    6=6  [perfect number];
import java.util.Scanner;

public class perfect_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }

        if(sum==num){
            System.out.println("perfect number");
        }else{
            System.out.println("not perfect number");
        }
    }
}
