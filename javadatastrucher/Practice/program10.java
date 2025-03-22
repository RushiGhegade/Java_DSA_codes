// Carray Froword
// find leftmost max ans print


class Main{

	public static void main(String args[]){
		
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		int temp[]=new int[arr.length];

		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			for(int j=i;j>=0;j--){
			
				if(arr[j]>max)
					max=arr[j];
			}
			temp[i]=max;
		}

		for(int i=0;i<temp.length;i++){
                        System.out.print(temp[i]+" ");
                }System.out.println();

	}
}
