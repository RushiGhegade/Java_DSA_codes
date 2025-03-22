// write and read the file

import java.io.*;
class FileDemo{
	public static void main(String args[])throws IOException{
		File f=new File("RushiInfo.txt");
		FileWriter fw=new FileWriter(f,true);

		fw.write("Rushi\n");
		fw.write("Ghegade@123\n");
		fw.write("Engineering\n");
		fw.close();

		FileReader fr=new FileReader("RushiInfo.txt");
		int data=fr.read();

		while(data!=-1){
			System.out.print((char)data);
			data=fr.read();
		}

		fr.close();
	}
}


