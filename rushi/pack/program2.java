import java.util.Scanner;
import armstrong.program1;

class Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();

		program1 obj=new program1(num);
		obj.method();
	}
}
