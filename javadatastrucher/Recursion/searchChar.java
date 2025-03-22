// Search the character in Given Array


class Demo{

	// Using Recursion
	
	int Search(char ch[],char search,int n){

		if(n==0)
			return -1;

		if(ch[n-1]==search)
			return n-1;

		return Search(ch,search,n-1);
	}	

	// Normal Code	
	/*int Search(char arr[],char search){

		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==search){
				return i;
			}
		}
		return -1;
		
	}*/
	public static void main(String args[]){
	
		char arr[]=new char[]{'A','B','C','D','E','F'};
		int n=arr.length;
		char search='c';
		
		Demo obj=new Demo();

		int index=obj.Search(arr,search,n);
		System.out.println(index);

	}
}
