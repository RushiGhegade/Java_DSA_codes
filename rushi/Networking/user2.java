// for client

import java.net.*;
import java.io.*;

class Client{
	public static void main(String args[])throws IOException{
		Socket s=new Socket("localhost",1200);
		InputStream is =s.getInputStream();

		BufferedReader br=new BufferedReader(new InputStreamReader(is));

		String str;

		while((str=br.readLine())!=null){
			System.out.println(str);
		}

		ServerSocket ss=new ServerSocket(1200);
		Socket sos=ss.accept();
		OutputStream oss=sos.getOutputStream();
		PrintStream pss=new PrintStream(oss);

		pss.println("I am Client");
		pss.println("take care");

		is.close();
		s.close();
		pss.close();
		oss.close();
		sos.close();
		ss.close();

	}
}
