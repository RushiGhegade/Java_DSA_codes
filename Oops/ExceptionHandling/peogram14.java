// throw predefine Exception

import java.util.Scanner;
public class peogram14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        try{
            if(x==0){
                throw new ArithmeticException("Devide By Zero");
            }
            System.out.println(10/x);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
