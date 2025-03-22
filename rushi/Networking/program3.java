// open url through java code

import java.io.*;
import java.awt.*;
import java.net.*;
class Demo{
	public static void main(String args[])throws IOException{
		URI uri=new URI("http://www.google.com");
		Desktop desk=Desktop.getDesktop();
		desk.browser(uri);
	}
}
