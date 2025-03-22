// Print 1-10 Sum


class Demo {
	
	int fun(int x){
		

		if(x==0)
			return 0;

		return x+fun(--x);

	}

	public static void main(String args[]){
		Demo obj=new Demo();
		System.out.println(obj.fun(10));
	}	
}
