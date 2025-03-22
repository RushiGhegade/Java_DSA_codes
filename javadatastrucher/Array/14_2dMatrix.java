// Basic of 2D matrix

class Demo{
	public static void main(String args[]){
		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		// print row to row
		System.out.println("print row to row");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		
		// print col to col	
		System.out.println(" \nprint col to col");		
		for(int i=0;i<arr[0].length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[j][i]+" ");
			}System.out.println();
		}

		//Sum of row to row
		System.out.println("\nSum of row to row");
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr.length;j++){
				sum=sum+arr[i][j];
			}System.out.println(sum);
		}
		
		// Sum of col to col
		System.out.println("\nSum of col to col");
		for(int i=0;i<arr[0].length;i++){
			int sum=0;
			for(int j=0;j<arr.length;j++){
				sum=sum+arr[j][i];
			}System.out.println(sum);
		}

		//sum of entire matrix
		System.out.println("\n print the sum of entire matrix");
		int totalSum=0;
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[i].length;j++){
				sum=sum+arr[i][j];
			}
			totalSum=totalSum+sum;
		}
		System.out.println(totalSum);


	}
}

