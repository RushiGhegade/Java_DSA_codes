// Count the Number of zero 
// eg. num=109080 
//     ans=3
import java.util.*;
class Demo{

	// using Recursion
	int cntzero(int num,int count){

		if(num==0)
			return count;
		
		int rem=num%10;

		if(rem==0)
			count++;

		return cntzero(num/10,count);
	}

	int countZero(int num){

		int count=0;
		while(num!=0){

			int rem=num%10;

			if(rem==0)
				count++;

			num=num/10;
		}
		return count;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();

		Demo obj=new Demo();

		int ans=obj.countZero(num);
		System.out.println(ans);

		int ans1=obj.cntzero(num,0);
                System.out.println(ans1);
	}
}
