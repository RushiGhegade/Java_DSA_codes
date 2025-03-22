// marge TwoSorted Array of N*M size without ExtraSpace
// eg. arr1=[1,3,5,7];
// 	arr2=[2,4,6,8];
//	Ans:
// 	arr1=[1,2,3,4];
// 	arr2=[5,6,7,8];


class Marge{

	void margetwoArray(int arr1[],int arr2[]){
	
		int i=0;
		int m=i;
		while(i<arr1.length){

			int min=arr1[i];
			boolean flag=true;
			for(int j=0;j<arr2.length;j++){
				if(arr2[j]<min){
					flag=false;
					min=arr2[j];
					 m=j;
				}
			}
			
			if(flag==false){
				int temp=arr1[i];
				arr1[i]=arr2[m];
				arr2[m]=temp;
			}

			i++;
		}
		
		for(int k=0;k<arr2.length;k++){
			for(int l=0;l<arr2.length-1-k;l++){
				if(arr2[l]>arr2[l+1]){

					int temp=arr2[l];
					arr2[l]=arr2[l+1];
					arr2[l+1]=temp;
				}
			}
		}

		for(int k=0;k<arr1.length;k++){
			System.out.print(arr1[k]+" ");
		}System.out.println();

		for(int k=0;k<arr2.length;k++){
                        System.out.print(arr2[k]+" ");
                }System.out.println();
	}

	public static void main(String args[]){
	

		int arr1[]=new int[]{10,12};
		int arr2[]=new int[]{5,18,20};

		Marge obj=new Marge();

		obj.margetwoArray(arr1,arr2);

	}
}
