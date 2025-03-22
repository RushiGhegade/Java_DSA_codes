// Given an matrix of size N*M
// print all the Daigonal left to Right
// start for 0 index
// 1   2   3  4   5
// 6   7   8  9   10
// 11  12  13 14  15

// O/P --> 1
//         2 6
//         3 7 11
//         4 8 12
//         5 9 13

class Demo{
	public static void main(String args[]){
		int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

		for(int x=0;x<arr[0].length;x++){
			int i=0;
			int j=x;

			while(i<arr.length && j>=0){
				System.out.print(arr[i][j]+" ");
				i++;
				j--;
			}
			System.out.println();
		}
	}
}
