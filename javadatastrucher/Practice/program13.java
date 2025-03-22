// Find the right Side leader

import java.util.*;
class leader{
	
	public static void main(String args[]){
		
		int arr[]=new int[]{16,17,4,3,5,2};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		List<Integer> l=new ArrayList<Integer>();
		int n=arr.length;

		int max=Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--){

			if(arr[i]>max){
				max=arr[i];
				l.add(max);
			}
		}

		System.out.println(l);
	}
}
