// reverse the Array without Using Extra Space

class Reverse{


	void reverse(int arr[]){
		
		int i=0;
		int j=arr.length-1;

		while(i<j){

			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;

			i++;
			j--;
		}
	}

	public static void main(String args[]){

		int arr[]=new int[]{1,2,3,4,5,6,7,8,9};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		Reverse r=new Reverse();

		r.reverse(arr);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();
	}
}
