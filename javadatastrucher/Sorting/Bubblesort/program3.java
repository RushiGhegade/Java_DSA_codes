// 3rd Approch


class Demo{
	static void BubbleSort(int arr[]){
		int n=arr.length;
		int itr=0;
		boolean swap;
		for(int i=0;i<n;i++){
			swap=false;
			for(int j=0;j<n-i-1;j++){
				itr++;
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(swap==false){
				break;
			}
		}

		System.out.println(itr);
	}
	public static void main(String args[]){
		int arr[]=new int[]{3,7,9,4,2,5,6};

		BubbleSort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
