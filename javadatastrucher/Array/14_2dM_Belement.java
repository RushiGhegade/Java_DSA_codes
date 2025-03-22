// Given a N*M matrix 
// print the Boundary in Clockwise fashion

// 1  2  3 
// 4  5  6 --> 1 2 3 6 9 8 7 4 
// 7  8  9

class Demo{

	public static void main(String args[]){
		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		int i=0;
		int j=0;
		// Top corner
		for(int x=0;x<arr.length-1;x++){
			System.out.print(arr[i][j]+" ");
			j++;
		}
		// Right Corner
		for(int x=0;x<arr.length-1;x++){
			System.out.print(arr[i][j]+" ");
			i++;
		}

		// Bottom Corner
		for(int x=0;x<arr.length-1;x++){
			System.out.print(arr[i][j]+" ");
			j--;
		}

		// left Corner
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[i][j]+" ");
			i--;
		}

	}
}

// Time Complexity --> O(N)
