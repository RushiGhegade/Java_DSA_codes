// 1  2  3  4
// 5  6  7  8
// 9  10 11 12  ==> 1 2 3 4 8 12 16 15  14 13 9 5 6 7 11 10
// 13 14 15 16

class Demo{
	public static void main(String args[]){
		int arr[][]=new int[][]{{1, 2, 3, 4},
			                {5, 6, 7, 8},
					{9, 10,11,12},
					{13,14,15,16} };


		int n=arr.length;
		
		int i=0;
		int j=0;
		while(n>1){
			// Top Corner
			for(int x=0;x<n-1;x++){
				System.out.print(arr[i][j]+ " ");
				j++;
			}
			// Right Corner
			for(int x=0;x<n-1;x++){
				System.out.print(arr[i][j]+" ");
				i++;
			}
			// Bottem Corner
			for(int x=0;x<n-1;x++){
				System.out.print(arr[i][j]+" ");
				j--;
			}
			// Left Corner
			for(int x=0;x<n-1;x++){
				System.out.print(arr[i][j]+" ");
				i--;
			}
			n=n-2;
			i++;
			j++;

		}

		if(n==1){
			System.out.print(arr[i][j]);
		}
	}
}
