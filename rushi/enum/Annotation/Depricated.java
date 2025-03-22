class Parent{
	@Deprecated
	void fun(){
		System.out.println("In Fun Method");
	}
}
/*class Child extends Parent{
	void fun(){
		System.out.println("In Child ");
	}
}*/
class Demo{
	public static void main(String args[]){
		@SuppressWarnings("hello")
		Parent obj=new Parent();
		obj.fun();
	}
}
