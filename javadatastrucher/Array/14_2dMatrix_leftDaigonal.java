// Given a Square matrix print left daigonal
//  1 2 3
//  4 5 6
//  7 8 9
//  O/P --> 1 ,5, 9

// Given a Square matrix print Right daigonal
//  1 2 3
//  4 5 6
//  7 8 9
//  O/P --> 3,5,7
class Daigonal{
	public static void main(String args[]){
		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		// left Daigonal
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i][i]);
		}

		// Right Daigonal
		System.out.println();
		int i=0;
		int j=arr.length-1;

		while(i<arr.length && j>=0){
			System.out.println(arr[i][j]);
			i++;
			j--;
		}
	}
}	
