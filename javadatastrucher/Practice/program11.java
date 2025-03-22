// CarryForword Approch

class CarryForword{
	//leftMax
	static void leftmax(int arr[]){
		int leftMax[]=new int[arr.length];
                leftMax[0]=arr[0];

                for(int i=1;i<arr.length;i++){
                        if(leftMax[i-1]<arr[i]){
                                leftMax[i]=arr[i];
                        }else{
                                leftMax[i]=leftMax[i-1];
                        }

                }
		 for(int i=0;i<leftMax.length;i++){
                        System.out.print(leftMax[i]+" ");
                }System.out.println();

	}
	// RightMax
	static void rightmax(int arr[]){

		int n=arr.length;
		int rightMax[]=new int[n];

		rightMax[n-1]=arr[n-1];

		for(int i=n-2;i>=0;i--){
			if(rightMax[i+1]<arr[i])
				rightMax[i]=arr[i];
			else
				rightMax[i]=rightMax[i+1];
		}
		for(int i=0;i<rightMax.length;i++){
                        System.out.print(rightMax[i]+" ");
                }System.out.println();

	}
	// WithoutUsing Extra Space
	//LeftMax
	static void maxleft(int arr[]){
		
		for(int i=1;i<arr.length;i++){
			if(arr[i-1]<arr[i]){
				arr[i]=arr[i];
			}else{
				arr[i]=arr[i-1];
			}
		}

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();
	}
	public static void main(String args[]){
		
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();


		leftmax(arr);

		rightmax(arr);

		maxleft(arr);
		
	}
}
