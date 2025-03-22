
package pelindrome;

public class program3{
	int num=0;
	public program3(int num){
		this.num=num;
	}

	public void method(){
		int temp=num;
		int rev=0;
		while(temp!=0){
			rev=rev*10;
			rev=rev+temp%10;
			temp=temp/10;
		}
		if(rev==num){
			System.out.println("pelindrome number");
		}else{
			System.out.println("not pelindrome number");
		}
	}
}
