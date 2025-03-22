// URL Connection

import java.io.*;
import java.net.*;
class Demo{

	public static void main(String args[])throws IOException{

			URL url=new URL("http://www.google.com:80");

			System.out.println(url.getProtocol());

			System.out.println(url.getPort());

			System.out.println(url.getFile());
	}
}
