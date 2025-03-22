// Hendel NumberFormatException in java

import java.io.*;
class Demo{

	public static void main(String args[])throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int num=0;
		try{
			num=Integer.parseInt(br.readLine());
		}catch(NumberFormatException e){

			System.out.println("Enter the Integer");
			num=Integer.parseInt(br.readLine());

		}
		System.out.println(num);
	}
}
