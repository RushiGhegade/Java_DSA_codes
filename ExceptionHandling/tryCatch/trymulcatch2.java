// Try Catch multipale
// Child =>to=> Parent --> oK

class Demo{
	
	public static void main(String args[]){
		
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println("A");
		}catch(NumberFormatException e){
			System.out.println("N");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array");
		}catch(Exception e){
			System.out.println("E");
		}
	}
}
