// server connection

import java.net.*;
import java.io.*;

class Demo{
	public static void main(String args[])throws IOException{
		ServerSocket ss=new ServerSocket(1200);
		Socket s=ss.accept();
		System.out.println("Connection Established");

		OutputStream os=s.getOutputStream();
		PrintStream ps=new PrintStream(os);
		ps.println("Hello");
		ps.println("go to hill");
		ps.close();
		os.close();
		ss.close();

		Socket s1=new Socket("localhost",1200);
		InputStream is=s1.getInputStream();

		BufferedReader br=new BufferedReader(new InputStreamReader();)
		String str;
		while((str=readLine())!=null){
			System.out.println(str);
		}
		is.close();
		s1.close();
	}
}
