// paramerized lambda Funtion

interface core2web{
	void run(int x,float y);
}

class Demo{
	public static void main(String args[]){
		core2web obj= (data1,data2) -> {
			System.out.println("hello Programmer "+data1);
		};

		obj.run(10,20.4f);
	}
}
