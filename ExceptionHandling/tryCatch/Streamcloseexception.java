// Handel the StreamCloseException in java

import java.io.*;
class Demo{
	

	public static void main(String args[])throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int num=0;
		try{

		num=Integer.parseInt(br.readLine());

		br.close();
		
		num=Integer.parseInt(br.readLine());
		}catch(Exception e){
			System.out.println(e);
		}

		System.out.println(num);
		
	}
}
