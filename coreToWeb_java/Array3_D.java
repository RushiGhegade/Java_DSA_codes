// jagged 3_d array:

import java.util.Scanner;
public class Array3_D {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[][][]=new int[3][2][];
        arr[0][0]=new int[3];
        arr[0][1]=new int[2];
        arr[1][0]=new int[5];
        arr[1][1]=new int[4];
        arr[2][0]=new int[2];
        arr[2][1]=new int[4];



        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print("("+i+","+j+","+k+")");
                    arr[i][j][k]=sc.nextInt();
                }
                System.out.println("enter the ("+i+""+j+") element ");
            }
        }

        for(int[][] x:arr){
            for(int[] y:x){
                for(int z:y){
                    System.out.print(z+" ");
                }
                System.out.println();
            }
            System.out.println();
        }



    }

}
