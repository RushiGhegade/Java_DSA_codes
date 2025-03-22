// Count the pair(a,g)

class Demo{
	
	public static void main(String args[]){
		
		char ch[]=new char[]{'a','b','e','g','a','g'};

		
		int count=0;
		int a=0;

		for(int i=0;i<ch.length;i++){
	
			if(ch[i]=='a'){
				a++;
			}
			if(ch[i]=='g'){
				count=count+a;
			}
		}

		System.out.println(count);
	}
}
