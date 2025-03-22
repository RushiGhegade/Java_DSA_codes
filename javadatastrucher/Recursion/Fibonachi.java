
// Fibonaci Series using Nromal And Recursion


class Recursion{
		

	void fibonachi(int a,int b){
		
		int c=a+b;

		if(c>20){
			return ;
		}

		System.out.print(c+" ");

		a=b;
		b=c;
	
		fibonachi(a,b);	
	}

	public static void main(String args[]){
		

		Recursion obj=new Recursion();
		obj.fibonachi(0,1);
	}
}




class Normal{


	void Fibonachi(int n){

		int a=0;
                int b=1;
		
		while(a<=n+1){
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}

	}

	public static void main(String args[]){
		
		Normal obj=new Normal();
		obj.Fibonachi(20);
	}
}
