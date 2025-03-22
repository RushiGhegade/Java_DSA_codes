// for server
import java.net.*;
import java.io.*;
class Server{
	public static void main(String args[])throws IOException{
		ServerSocket ss=new ServerSocket(1200);
		Socket s=ss.accept();
		System.out.println("Connection Established");
		
		OutputStream os=s.getOutputStream();
		PrintStream ps=new PrintStream(os);

		ps.println("hello");
		ps.println("Go back");

		Socket so=new Socket("localhost",1200);
		InputStream is=so.getInputStream();

		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String str;

		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
		is.close();
		so.close();

		ps.close();
		os.close();
		s.close();
		ss.close();

	}
}
