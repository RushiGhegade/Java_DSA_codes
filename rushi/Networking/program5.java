// client connection 
import java.io.*;
import java.net.*;
class Demo{
	public static void main(String arag[])throws IOException{

		Socket s=new Socket("localhost",1200);
		InputStream is=s.getInputStream();

		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		
		String str;

		while((str=br.readLine())!=null){
			System.out.println(str);

		}
		s.close();
		br.close();
	}
}
