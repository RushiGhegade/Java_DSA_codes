// representation of 2_D array
import java.util.Scanner;
class program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];     // matrix 3*3 

        // input 2_D Array
        for(int i=0;i<arr.length;i++){                   // row
            for(int j=0;j<arr[i].length;j++){            // columan
                arr[i][j]=sc.nextInt();
            }
        }

        // output 2_D Array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}