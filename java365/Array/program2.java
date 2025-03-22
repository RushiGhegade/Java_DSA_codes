/*Given an array (or string), the task is to reverse the array/string.
Examples : 
 

Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}*/
public class program2 {
  public static void main(String args[]){
    int arr[]=new int[]{4, 5, 1, 2};

    int i=0;
    int j=arr.length-1;

    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
    }
  }  
}
