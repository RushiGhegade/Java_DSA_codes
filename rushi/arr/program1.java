
import java.io.*;
class Demo{
	static void update(int arr[]){
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]+1;
		}
	}
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int arr[]=new int[5];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("after Update");	
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		update(arr);
		System.out.println("\n Before Update \n");
		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+"  ");
		}
	}
}
