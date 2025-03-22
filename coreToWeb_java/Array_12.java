import java.io.*;
class Array_12{
    public static void main(String args[])throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array:");
        int size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];
        System.out.println("Enter the element array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("array is=");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int count=0;
            for(int j=1;j<=num;j++){
                if(num%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("prime number "+arr[i]+" is found in index "+i);
            }
        }
    }
}