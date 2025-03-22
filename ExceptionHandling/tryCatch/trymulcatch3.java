// try with multipale catch

import java.io.*;
class Demo{
	
	public static void main(String args[])throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int num=Integer.parseInt(br.readLine());

		br.close();

		try{
			num=Integer.parseInt(br.readLine());		
		}catch(Exception e){

		}catch(IOException e){

		}
	}
}
