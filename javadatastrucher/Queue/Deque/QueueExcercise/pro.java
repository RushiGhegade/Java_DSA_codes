// Valid ParaThesis Chekar
import java.util.*;
class Main{	
	static boolean checkpara(String str){
		Stack s=new Stack();	
		for(int i=0;i<str.length();i++){
			
			char ch=str.charAt(i);

			if(ch=='{' || ch=='[' || ch=='('){
				s.push(ch);
			}else{
				
				if(!s.empty()){
					int x=(char)s.pop();

					if((x=='{' && ch=='}') || (x=='[' && ch==']') || (x=='(' && ch==')') ){
							return true;
					}else{
						return false;
					}
				}else{
					return false;
				}		
			}				
		}
		if(!s.empty())
                        return false;
                else
			:return true;

	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Expression");
		String str=sc.nextLine();

		boolean ans= checkpara(str);

		if(ans)
			System.out.println("Valid Paranthesis");
		else
			 System.out.println("Not Valid Paranthesis");
	}
}
