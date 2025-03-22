// given an array of size n and q number of queries  queries contain two parameter (s,e);
//  s -> start index
//  e -> end index 
//  for all queries print the sum of element from index start to end

// brute force approch

import java.util.*;
class Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		System.out.println("Enter the number of queries");
		int q=sc.nextInt();
		
		for(int i=0;i<q;i++){
			int sum=0;
			System.out.println("start");
			int s=sc.nextInt();
			System.out.println("End");
			int e=sc.nextInt();
			for(int j=s;j<=e;j++){
				sum=sum+arr[j];
			}

			System.out.println(sum);
		}		
	}
}

// time complexity -> q * n  -> O(Q*n)

// optimize using prefix sum

class optimize{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int q=3;
		int n=arr.length;
		
		int temp[]=new int[arr.length];
		temp[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			temp[i]=temp[i-1]+arr[i];
		}
		
		int sum=0;
		for(int i=0;i<q;i++){
			int s=sc.nextInt();
			int e=sc.nextInt();
			
			if(s==0){
				sum=temp[e];
				System.out.print(sum+" ");
			}else{
				sum=temp[e]-temp[s-1];
				System.out.print(sum+" ");
			}
		}
	}
}

// time complexity -> q + n -> O(q+n)
