// addition of the odd element in arry:

import java.io.*;
public class Array3 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the arry:");
        size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];

        System.out.println("enter the integer element in array :");

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        int oddSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                oddSum=oddSum+arr[i];
            }
        }
        System.out.println("addition of the odd element in array is="+oddSum);

    }
}
