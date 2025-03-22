// find largest element and smallest element

import java.util.Scanner;
public class program2 {
    static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int  min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        
        //take Input Array
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // Array print
        System.out.println("array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int max=max(arr);
        int min=min(arr);
        System.out.println("\n");
        System.out.println("largest element :"+max);
        System.out.println("Smallest element :"+min);
    }
}
