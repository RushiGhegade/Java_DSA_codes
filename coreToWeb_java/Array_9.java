// marge array ;

import java.util.Scanner;

public class Array_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr1[]={10,20,30,40,50};
        int arr2[]={9,18,27,36,45};
        int size=arr1.length+arr2.length;

        int arr3[]=new int[size];
        int k=0;

        for(int i=0;i<arr1.length;i++){
            arr3[k]=arr1[i];
            k++;
        }

        for(int i=0;i<arr2.length;i++){
            arr3[k]=arr2[i];
            k++;
        }

        for(int i=0;i<k;i++){
            System.out.print(arr3[i]+" ");

        }



    }
}
