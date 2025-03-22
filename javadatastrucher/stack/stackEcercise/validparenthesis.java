// Valid parenthesis

import java.util.*;
class parenthesis{
	
	boolean vaildparenthesis(String str){
		
		Stack s=new Stack();

		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='{' || ch=='[' || ch=='('){
				s.push(ch);
			}else{
				if(!s.empty()){
					char x=(char)s.peek();
					if((x=='{' && ch=='}')|| (x=='[' && ch==']')|| (x=='(' && ch==')')){
						s.pop();
					}else{
						return false;
					}
				}else{
					return false;
				}
			}
		}
		if(s.empty()){
                      return true;
                }else{
                      return false;
                }
	}
}
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Expression");
		String str=sc.nextLine();

		parenthesis obj=new parenthesis();
		boolean ans=obj.vaildparenthesis(str);

		if(ans)
			System.out.println("balenced");
		else
			System.out.println("Not balenced");
	}
}
