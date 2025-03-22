// maximum and minimum Element in array

import java.util.Scanner;
class program1{
    // find maximum element 
    static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.print("maximum element is :");
        return max;
    }
    // find minimum element in array
    static int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.print("maximun element is :");
        return min;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the 5 Array Element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // maximum element
        System.out.println(max(arr));

        // minimum Element
        System.out.println(min(arr));
        
    }
}