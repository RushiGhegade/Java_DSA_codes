// Rotate the Array 

import java.util.*;
class Main{
	
	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,3,4};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the k value");
		int k=sc.nextInt();
		
		int n=k%arr.length;

		for(int i=0;i<n;i++){

			int element=arr[arr.length-1];

			for(int j=arr.length-1;j>=1;j--){
				
				arr[j]=arr[j-1];
			}
			arr[0]=element;
		}

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();


	}
}
