// PrefixSum
// Using Extra Array

import java.util.*;
class PrefixSum{

	public static void main(String args[]){


		int arr[]=new int[]{1,2,3,4,5,6};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		int psum[]=new int[arr.length];

		psum[0]=arr[0];

		for(int i=1;i<arr.length;i++){
			
			psum[i]=psum[i-1]+arr[i];		
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
				System.out.println(psum[e]);
			else
				System.out.println(psum[e]-psum[s-1]);
		}

	}
}
