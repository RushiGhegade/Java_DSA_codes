// NumberFormatException In java
import java.util.*;
import java.io.*;
class Demo{
	
	void input()throws Exception{



		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int num=Integer.parseInt(br.readLine()); // when you give the String,char,etc then it will give you exception 
		
		br.close();
		
		 int num1=Integer.parseInt(br.readLine());	
	}


	public static void main(String args[]) throws Exception{

		System.out.println("Start main");

		Demo obj=new Demo();
		obj.input();
			
	}

}
