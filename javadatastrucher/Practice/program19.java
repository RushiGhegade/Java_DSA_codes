// print the sum of the every single subarray using prefix sum

class Demo{

	public static void main(String args[]){
		
		int arr[]=new int[]{2,4,1,3};

		int psum[]=new int[arr.length];
		psum[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			psum[i]=psum[i-1]+arr[i];
		}

		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int sum=0;
				if(i==0){
					sum=psum[j];
				}else{
					sum=psum[j]-psum[i-1];
				}
				System.out.println(sum);
			}
		}
	}
}

// Using Carryforword Aproch
class Main{
	public static void main(String args[]){
		
		int arr[]=new int[]{2,4,1,3};

		for(int i=0;i<arr.length;i++){
			int sum=0;

			for(int j=i;j<arr.length;j++){
				sum=sum+arr[j];
				System.out.println(sum);
			}
		}
	}	
}




