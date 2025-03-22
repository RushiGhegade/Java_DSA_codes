// PrefixSum 
// Without Using Extra Space

import java.util.*;
class Main{
	
	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,3,4,5,6};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		for(int i=1;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i];
		}

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Queries");
		int q=sc.nextInt();

		for(int i=0;i<q;i++){
			System.out.println("Start");
                	int s=sc.nextInt();

               		System.out.println("End");
                	int e=sc.nextInt();

			if(s==0)
				System.out.println(arr[e]);
			else
				System.out.println(arr[e]-arr[s-1]);
		}

	}
}
