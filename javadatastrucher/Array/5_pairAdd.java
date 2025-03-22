// print the pairs addition


class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{1,2,3,4,5};

		int i=0;
		int j=arr.length-1;

		while(i<=j){
			if(i==j){
				System.out.print(arr[i]+" ");
			}else{
				System.out.print(arr[i]+arr[j]+" ");
			}
			i++;
			j--;
		}

	}
}

// Time Complexity => N/2 (iteration) => O(N)
