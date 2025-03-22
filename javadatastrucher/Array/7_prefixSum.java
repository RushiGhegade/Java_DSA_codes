// prefix sum

// intput :
// arr={1,2,3,4}

// output :
// {1,2,6,10}

//using extra space
import java.util.*;
class Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};

		int temp[]=new int[arr.length];
		temp[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			temp[i]=temp[i-1]+arr[i];
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(temp[i]+" ");
		}
	}
}
// space complexity -> O(n)
// time complexity  -> n + n -> O(n)


// don't using extra space
class Demo1{
	public static void main(String args[]){
		
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};

		for(int i=1;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i];
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
// space complexity -> O(1)
// time complexity  -> O(n)
