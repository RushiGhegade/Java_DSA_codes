//  throw the userdefine exception when we whithdrow money gretter then cash and less then zero

import java.util.*;
class withdrowless extends RuntimeException{
	
	withdrowless(String str){
		super(str);
	}
}

class withdrowgretter extends RuntimeException{
	
	withdrowgretter(String str){
		super(str);
	}
}

class ATM{
	
	static int cash=10000;

	public static void main(String args[]){
	

		while(true){	
		Scanner sc=new Scanner(System.in);

		int withdrow=sc.nextInt();

		if(withdrow >0 && withdrow<=cash){
			System.out.println(withdrow+" withdrow Successfully ");
			cash=cash-withdrow;
			System.out.println("Now Your cash is "+cash+" rs");
		}else if(withdrow <=0){
			
			throw new withdrowless("can't withdrow money less then 0rs");
		}else if(withdrow > cash){
			throw new withdrowgretter("insufficient Money");
		}
		}
		
	}
}
