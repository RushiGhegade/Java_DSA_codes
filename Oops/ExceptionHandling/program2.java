// ArrayIndexOutOfBoundException

public class program2 {
    public static void main(String args[])throws ArrayIndexOutOfBoundsException{
        System.out.println("start main");

        int arr[]=new int[]{1,2,3,4,5};

        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
