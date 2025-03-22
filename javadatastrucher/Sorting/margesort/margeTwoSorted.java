class Main{

	int[] marge(int arr1[],int arr2[]){
		int n=arr1.length+arr2.length;

		int arr3[]=new int[n];

		int i=0;
		int j=0;
		int k=0;

		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				arr3[k]=arr1[i];
				i++;
			}else{
				arr3[k]=arr2[j];
				j++;
			}
			k++;
		}

		while(i<arr1.length){
			arr3[k]=arr1[i];
			i++;
			k++;
		}

		while(j<arr2.length){
			arr3[k]=arr2[j];
			j++;
			k++;
		}

		return arr3;
	}
	public static void main(String args[]){
		
		int arr1[]=new int[]{1,3,5,7,9};
		int arr2[]=new int[]{2,4,6,8};

		Main obj=new Main();
		int arr3[]=obj.marge(arr1,arr2);

		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}System.out.println();
	}
}
