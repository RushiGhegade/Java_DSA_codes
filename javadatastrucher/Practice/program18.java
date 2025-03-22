// find the length of the smallest subArray which Contain both max and min


class Demo{
	public static void main(String args[]){
		
		int arr[]=new int[]{1,6,3,1,3,4,6,4,6,3};

		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];

			if(arr[i]<min)
				min=arr[i];
		}

		int mindist=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==min){
				
				for(int j=i+1;j<arr.length;j++){
					if(arr[j]==max){
						int dist=j-i+1;
						if(dist<mindist){
							mindist=dist;
						}
					}
				}
			}else if(arr[i]==max){
				for(int j=i+1;j<arr.length;j++){
					if(arr[j]==min){
						int dist=j-i+1;

						if(dist<mindist){
							mindist=dist;
						}
					}
				}
			}
		}
		System.out.println(mindist);
	}
}

