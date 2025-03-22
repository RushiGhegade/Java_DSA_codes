// duplicate number :
import java.io.*;
public class arrayPractice {
    public static void main(String args[])throws IOException{
        int []arr=new int[5];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the element ");

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
