// 2_D Array [Find max, min ,largest element in 2_D Array] 
import java.util.Scanner;
public class program2 {
    // search element
    static void search(int arr[][],int key){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Element found at index ("+i+","+j+")");                    
                }
            }
        } 
    }

    // max element
    static int max(int arr[][]){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.print("max element is :");
        return max;
    }
    
    // min element
    static int min(int arr[][]){
        int min =arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.print("min element is : ");
        return min;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[3][3];
        // input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        // output
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }

        // find
        System.out.println("Enter the search element");
        int key=sc.nextInt();
        search(arr,key);

        // max
        System.out.println(max(arr));

        // min 
        System.out.println(min(arr));

               
    }
}
