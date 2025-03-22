// Count the pair(a,b,c)

import java.util.*;
class CountPair{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		char arr[]=new char[size];

		System.out.println("Enter the Array Element");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}


		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		int a=0;
		int b=0;
		int ab=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]=='a'){
				a=a+1;	
			}
			if(arr[i]=='b'){
				b++;

				ab=a*b;
			}

			if(arr[i]=='c'){
				count=count+ab;
			}
		}

		System.out.println(count);
	}
}
