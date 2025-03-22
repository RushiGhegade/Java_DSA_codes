// Nested Try Catch block

import java.io.*;
import java.util.Scanner;

public class program9 {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[5];

        for(int i=0;i<arr.length;i++){
            // arr[i]=sc.nextInt();
            try{
                arr[i]=Integer.parseInt(br.readLine());
            }catch(NumberFormatException e){
                System.out.println("enter the correct integer number");
                try{                                                            // Nested Try catch
                    arr[i]=Integer.parseInt(br.readLine());
                }catch(NumberFormatException obj){
                        System.out.println("Enter the correct Integer Number");
                        arr[i]=sc.nextInt();
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
