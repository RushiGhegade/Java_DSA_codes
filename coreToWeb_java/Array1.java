// addition of the array element
import java.io.*;

public class Array1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array:");
        int size=Integer.parseInt(br.readLine());

        // arry declaration ;

        int arr[]=new int[size];

        System.out.println("Enter the element in array:");

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of the array element is="+sum);
    }
}
