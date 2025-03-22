

package strongnumber;

class program5{
	int num=0;
	 program5(int num){
		this.num=num;
	}

	void method(){
		
		int temp=num;
		int sum=0;
		while(temp!=0){
			int rev=temp%10;
			int  fact=1;
			for(int i=1;i<=rev;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num){
			System.out.println("number is Strong number");
		}else{
			System.out.println("number is not Strong number");
		}
	}
}
