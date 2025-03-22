// Basic of the file handling

import java.io.*;
class Demo{
	public static void main(String args[])throws IOException{
		File fobj=new File("core2web.text");     	// it not create a core2web.text file. fobj only represent core2web.text file
		
//		fobj.createNewFile();                    	//  it's create a file only

		fobj.mkdir();  					// it's create a folder
			
		File fobj2=new File(fobj,"code.text"); 		// fobj point to core2web.text file. mains code.text file create in core2webfolder
		
		//fobj2.createNewFile();               		// it's create a file in code.text inside core2web.text if only if core2web.text is folder 
		
		fobj2.mkdir();   				
		  				
		

	}
}
