package armstrong;

public class program1{
	int num=0;
	public program1(int num){
		this.num=num;
	}

	public void method(){
		int count=0;
		int temp=num;

		while(temp!=0){
			count++;
			temp=temp/10;
		}

		int temp1=num;
		int sum=0;
		while(temp1!=0){
			int rev;
			rev=temp1%10;
			int mul=1;
			for(int i=1;i<=count;i++){
				mul=mul*rev;
			}
			sum=sum+mul;
			temp1=temp1/10;
		}
		if(sum==num){
			System.out.println("armstrong number");
		}else{
			System.out.println("not armstrong number");
		}
	}
}
