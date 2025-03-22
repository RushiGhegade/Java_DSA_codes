//given an array of size n count the number of element having atleast 1 element gretter then it selt

// brute force approch
class Demo{
	public static void main(String args[]){
		
		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
			
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
// Time Complexity => O(n) * O(n)  =>  O(n^2)


// optimize code

class optimize{
	public static void main(String args[]){
		
		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
		
		// first find maximum element because no element present in array which gretter then maximum element 
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

		// find gretter number count;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==max){
				count++;
			}
		}
		System.out.println(arr.length-count);


	}
}
// Time Complexity => O(n) +O (n) => O(n)
