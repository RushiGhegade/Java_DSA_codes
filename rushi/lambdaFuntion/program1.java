// not parameterize lambda funtion
interface rushi{
	void run();

}

class Demo{
	public static void main(String args[]){

		rushi obj=()->{
			System.out.println("hello Programmer");
		};

		obj.run();
	}
}
