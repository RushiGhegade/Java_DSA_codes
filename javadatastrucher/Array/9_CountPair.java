// GOOGLE

// Given an charator array(lowercase)
// return the count of piars(i,j) such that
// 1) i<j
// 2) arr[i]='a';
// 3) arr[i]='g';

class Demo{
	public static void main(String args[]){
		char ch[]=new char[]{'a','b','e','g','a','g'};
		int n=ch.length;
		int count=0;
		for(int i=0;i<n;i++){
			if(ch[i]=='a'){
				for(int j=i+1;j<n;j++){
					if(ch[j]=='g'){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
// Time Complexity -> O(N)*O(N) -> O(N*N)
// Space Complexity -> O(N)

// Optimize

class Optimize{
	public static void main(String args[]){
		
		char ch[]=new char[]{'a','b','e','g','a','g','g'};
		int n=ch.length;
		
		int al=0;
		int a=0;
		for(int i=0;i<n;i++){
			if(ch[i]=='a'){
				a=a+1;
			}else if(a>0 && ch[i]=='g'){
				al=al+a;
			}

		}

		System.out.println(al);

	}
}

// TimeComplecity -> O(N)
// SpaceComplexity -> O(N)

