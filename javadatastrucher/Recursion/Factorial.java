// Find the Factoral of the Number

class Demo{
	
	int fact(int x){
		if(x<=1)
			return 1;

		return x * fact(--x);
	}

	public static void main(String args[]){
		Demo obj=new Demo();
		System.out.println(obj.fact(5));
	}
}

// using veriabel

class Main{
	
	
	int Fact=1;
	int fact(int x){
		
		if(x==1)
			return Fact;

		Fact=Fact*x;

		return fact(--x);
	}

	public static void main(String args[]){
		
		Main obj=new Main();
		System.out.println(obj.fact(5));
	}
}
