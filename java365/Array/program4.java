/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false*/
public class program4 {
    static boolean duplicate(){
        int arr[]=new int[]{1,2,3,4};

    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                return true;
            }
            
        }
    }
    return false;
    }
  public static void main(String args[]){
    boolean ans=duplicate();
    System.out.println(ans);
  }  
}
