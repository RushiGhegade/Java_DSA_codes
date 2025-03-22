class Insertion{

	void sort(int arr[]){		
		
		for(int i=1;i<arr.length;i++){

			int j=i-1;
			int element=arr[i];
			while(j>=0 && arr[j]>element){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
	}
}
class Main{
	public static void main(String args[]){
		
		int arr[]=new int[]{7,3,9,4,2,5,6};

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

		Insertion obj=new Insertion();

		obj.sort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
