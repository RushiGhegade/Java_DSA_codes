import java.io.*;
class Demo{

	
	public static void main(String args[])throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int num=0;

		try{

			num=Integer.parseInt(br.readLine());
			System.out.println(num);
			//return;
			System.exit(1);
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("In Finally Block");
		}
	}
}
