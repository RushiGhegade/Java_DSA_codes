// InterruptedException in java


import java.io.*;
class Demo{
	
	public static void main(String args[])throws IOExceptionException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int num=Integer.parseInt(br.readLine());

	
		Thread t=Thread.currentThread();

		t.sleep(10);  // InterruptedException throws
		
	}
}
