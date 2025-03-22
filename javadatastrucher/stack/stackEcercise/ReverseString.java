// Revserse the String using stack

import java.util.*;
class reverseString{
	
	String revString(String str){
		
		Stack<Character> s=new Stack<Character>();
		char stackarr[]=new char[str.length()];
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i); 
			s.push(ch);
		}

		int i=0;
		while(!s.empty()){
			stackarr[i]=s.pop();
			i++;
		}

		return new String(stackarr);

	}
}

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();

		reverseString obj=new reverseString();

		String ans = obj.revString(str);
		System.out.println(ans);
	}
}
