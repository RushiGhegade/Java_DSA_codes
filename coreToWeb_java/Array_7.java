import java.util.Scanner;

public class Array_7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the size of the array:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the element in array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("\nmaximum element in array is ="+max);
        System.out.println("minimum element in array is ="+min);
    }
}
