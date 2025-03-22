import java.io.*;
import strongnumber.program5;
class Demo extends program5{
	Demo(int num){
		super(num);
	}
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		
		program5 obj=new Demo(num);
		obj.method();
	}
}
