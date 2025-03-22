//  Throw userdefine Function extends RuntimeException


import java.util.Scanner;
class underflowException extends RuntimeException{
    underflowException(String msg){
        super(msg);
    }
}
class overflowException extends RuntimeException{
    overflowException(String msg){
        super(msg);
    }
}
public class program14 {
    public static void main(String[] args) {
        int arr[]=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the valuue");
        System.out.println("0<elemnt<100");

        for(int i=0;i<arr.length;i++){
            int data=sc.nextInt();
            
            if(data<0)
            throw new underflowException("Number Less Then 0");

            if(data>100)
                throw new overflowException("Number Greter Then 100");

            arr[i]=data;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
        }
    }
}
