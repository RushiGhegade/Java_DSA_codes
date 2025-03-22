// return the length of smallest subarray which contain the both min of the array and max of the array

class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{1,2,3,1,3,4,6,4,6,3};
		int n=arr.length;

		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
	
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		int minlen=Integer.MAX_VALUE;
		int diff=0;
		for(int i=0;i<arr.length;i++){	
			if(arr[i]==min){
				for(int j=i+1;j<n;j++){
					if(arr[j]==max){
						 diff=j-i+1;
						if(minlen>diff){
							minlen=diff;
							
						}	
					}
				}
			}else if(arr[i]==max){
				for(int j=i+1;j<n;j++){
					if(arr[j]==min){
						diff=j-i+1;
						if(minlen>diff){
							minlen=diff;
						}
					}
				}
			}
		}

		System.out.println(minlen);
	}
}
