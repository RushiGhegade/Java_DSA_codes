// jagged array 2-D;

import java.io.*;
public class ArrayQuiz {
    public static void main(String[] args)throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[][]=new int[3][];
        System.out.println("enter the 1st row ");
        int x=Integer.parseInt(br.readLine());
        System.out.println("enter the 2nd row");
        int y=Integer.parseInt(br.readLine());
        System.out.println("enter the 3rd row");
        int z=Integer.parseInt(br.readLine());

        arr[0]=new int[x];
        arr[1]=new int[y];
        arr[2]=new int[z];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }

        for(int[] a: arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }




    }
}
