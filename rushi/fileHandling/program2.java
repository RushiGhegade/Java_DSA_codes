import java.io.*;
class Demo{
	public static void main(String args[])throws IOException{
		File fobj=new File("methods.text");
		fobj.createNewFile();

		System.out.println(fobj.getName());                  // methods.text

		System.out.println(fobj.getParent());                //  null  (because method.text does not come any of the folder)

		System.out.println(fobj.getAbsolutePath());          // Home/rushi123/rushi/fileHandling/methods
		
		System.out.println(fobj.canRead());                  // true
		
		System.out.println(fobj.canWrite());                 // true
		
		System.out.println(fobj.isDirectory());              // false
	
		System.out.println(fobj.isFile());                   // true
	
		System.out.println(fobj.lastModified()); 

		//System.out.println(fobj.delete());                 // Delete the file


		
	}
}
