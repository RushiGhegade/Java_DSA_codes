// count step
// num => even then divide    by 2;
// num => odd  then substrcat by 1;

import java.util.*;
class Demo{
	
	// Using Recursion
	int cntstep(int num,int step){
		
		if(num==0)
			return step;

		if(num%2==0)
			 return cntstep(num/2,step+1);
		else
			 return cntstep(num-1,step+1);

	}
	
	// Without Recursion
	int Countstep(int num){

		int step=0;
		while(num!=0){
			
			if(num%2==0){
				num=num/2;
			}else{
				num=num-1;
			}
			step++;
		}
		return step;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();

		Demo obj=new Demo();
		int step=obj.Countstep(num);
		System.out.println("Step :"+step);

		int step1=obj.cntstep(num,0);
                System.out.println("Step :"+step1);
	}
}
