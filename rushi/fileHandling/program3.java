// falg [true or false]
// true : remove old and write new 
// false : don't remove old and add new
// bydefault falg is false
import java.io.*;

class WriteDemo{
	public static void main(String args[])throws IOException{
		FileWriter fw=new FileWriter("Incubator.txt",true);         // throws IOException
		fw.write("Rushi\n");                                     // throws IOException
		fw.write("Ghegade@123\n");
		fw.write("Engineering\n");

		fw.close();                                           // throws IOException
	}
}
