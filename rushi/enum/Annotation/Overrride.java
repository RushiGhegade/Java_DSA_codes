
class Parent{
	
	void fun(int x){
		System.out.println("In Parent Fun Method");
	}
}
class Child extends Parent{
	@Override
	void fun(){
		System.out.println("In Child Fun Method");
	}
}

class Demo{
	public static void main(String args[]){
		Parent obj=new Child();
		obj.fun(10);
	}
}
