// throw userdefine Exception using IOException

import java.util.Scanner;
import java.io.*;

class underflowException extends IOException{
    underflowException(String msg){
        super(msg);
    }
}

class overflowException extends IOException{
    overflowException(String msg){
        super(msg);
    }
}\


public class program15 {
    public static void main(String args[])throws IOException{
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println("0<data<100");

        for(int i=0;i<arr.length;i++){
            int data=sc.nextInt();

            if(data<0)
            throw new underflowException("less then 0");

            if(data>100)
                throw new overflowException("greter then 100");

            arr[i]=data;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }    
}
