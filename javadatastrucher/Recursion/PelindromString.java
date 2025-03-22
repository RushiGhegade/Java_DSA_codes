 // Find the String is palindrome or notPalindrome
 
class Demo{


	boolean palindromestr(char ch[],int start,int end){


		if(start>=end){
			return true;
		}

		if(ch[start]==ch[end]){
			return palindromestr(ch,start+1,end-1);
		}else{
			return false;
		}
	}

	// using For Loop
	boolean palindrome(char ch[],int start,int end){
		
		while(start<end){
			if(ch[start]==ch[end]){
				start++;
				end--;	
			}else{
				return false;
			}
		}

		return true;
	}

	public static void main(String args[]){
		String str="rushi";

		Demo obj=new Demo();

		char ch[]=str.toCharArray();
		int start=0;
		int end=ch.length-1;

		boolean ans=obj.palindrome(ch,start,end);
		System.out.println(ans);

		boolean ans1=obj.palindromestr(ch,start,end);
                System.out.println(ans1);
	}
}
