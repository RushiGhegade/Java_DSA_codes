// reverse array in java;

import java.util.Scanner;

public class Array_8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the aaray is:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter the element in the array:");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("orignal array is =");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //  reverse logic;

        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            n--;
        }
        System.out.println("\nreverse array is =");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
