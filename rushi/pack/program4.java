
import java.util.Scanner;
import pelindrome.program3;
class Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int  num=sc.nextInt();

		program3 obj=new program3(num);
		obj.method();
	}
}
