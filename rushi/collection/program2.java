class myclass{
	protected void m1(){
		System.out.println("protected");
	}
}

class Demo extends myclass{

	public static void main(String args[]){
		Demo obj=new Demo();
		obj.m1();
	}
}
