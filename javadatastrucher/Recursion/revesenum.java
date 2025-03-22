// reverse the given number;


import java.util.*;
class Demo{

	// Using Recursion
	int reversenum(int num,int rev){

		if(num==0)
			return rev;

		int rem=num%10;

		rev=rev*10+rem;

		return reversenum(num/10,rev);
	}

	// Without Recursion
	int reverse(int num){

		int rev=0;
		while(num!=0){
			
			int rem=num%10;

			rev=rev*10+rem;

			num=num/10;
		}

		return rev;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();

		Demo obj=new Demo();
		int ans=obj.reverse(num);
		System.out.println("Reverse :"+ans);

		int ans1=obj.reversenum(num,0);
                System.out.println("Reverse :"+ans1);
	}
}
