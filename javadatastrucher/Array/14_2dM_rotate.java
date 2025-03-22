// Given an matrix of N*M
// Rotate the matrix 90 degree (clockwise) from top Rigth Corner
// Note : No New Matrix

//  1  2  3             7  4  1
//  4  5  6  rotate=>   8  5  2
//  7  8  9    90       9  6  3 

// 1  2  3		    1  4  7                7  4  1
// 4  5  6  transpoze ->    2  5  8   reverse ->   8  5  2
// 7  8  9 		    3  6  9     col        9  6  3


class Rotate{
	public static void main(String args[]){
		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};

		// transpose
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}

		// swap col 
		for(int x=0;x<arr.length;x++){
			int start=0;
			int end=arr.length-1;

			while(start<end){
				int temp=arr[x][start];
				arr[x][start]=arr[x][end];
				arr[x][end]=temp;
				start++;
				end--;
			}
		}

		//print 
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
}
