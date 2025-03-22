// second max
import java.io.*;
class array_10{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array:");
        int size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];
        System.out.println("Enter the element :");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("array is =");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        int max1=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                continue;
            }
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        System.out.println("second largest element is="+max1);
    }
}