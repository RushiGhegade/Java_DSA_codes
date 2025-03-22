// Use Of throw keyword to 
// 
// it can throw the exception explicitly handel to the jvm
// When we Can Use a throw keyword jvm can handel the  exception explicity 


class Main{
	
	public static void main(String args[]){
		
	//	System.out.println(10/0);       // This Exception is handel by the jvm Internally
	
		throw new ArithmeticException("don't  divide by Zero ");    // Throw Exception Explicitly

	//	throw null; // NullPointerException

	//	System.out.println("End Main");         // unreachable statment don't write any thing below throw keyword
	}
}
