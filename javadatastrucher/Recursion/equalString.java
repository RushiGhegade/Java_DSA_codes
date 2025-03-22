// Cheack the given string is equal or not

class Demo{
	

	boolean stringequal(String str1,String str2){
		
		if(str1.length()!=str2.length()){
			return false;
		}

		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();

		int count=0;
		for(int i=0;i<ch1.length;i++){
			if(ch1[i]==ch2[i])
				count++;
			else
				return false;
		}
		if(count==ch1.length)
			return true;
		else
			return false;
	}
	// Using Recursion
	boolean strequal(String str1,String str2,char ch1[],char ch2[],int index){
			

		if(index==ch1.length-1){
			return true;
		}

		if(str1.length()!=str2.length())
			return false;

		if(ch1[index]==ch2[index]){
			return strequal(str1,str2,ch1,ch2,index+1);
		}else{
			return false;
		}


	}
	public static void main(String args[]){
		String str="rushi";
		String str1="Rushi";

		Demo obj=new Demo();

		boolean ans=obj.stringequal(str,str1);
		System.out.println(ans);


		char ch1[]=str.toCharArray();
                char ch2[]=str1.toCharArray();

		boolean ans1=obj.strequal(str,str1,ch1,ch2,0);
                System.out.println(ans1);
	}
}
