// Given an square matrix of size N*M
// Convert the matrix to its transpose matrix 


class Demo{
	public static void main(String args[]){
		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				// swap the possition
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		// print array
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
}
