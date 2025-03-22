
// Optimize
class Demo{
	public static void main(String args[]){
		char arr[]=new char[]{'a','b','c','a','b','c'};
		
		int a=0;
		int ab=0;
		int pair=0;

		for(int i=0;i<arr.length;i++)	{
			if(arr[i]=='a'){
				a++;
			}
		       	if(arr[i]=='b'){
				ab=ab+a;
			}
		       	if(arr[i]=='c'){
				pair=pair+ab;
			}
		}
		
		System.out.println(pair);	
	}
}
