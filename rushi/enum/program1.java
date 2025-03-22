// Enumaration


enum Pro{

	Rushi,
	Ashish,
	Kanha,
	Kiran;
	
	Pro(){
		System.out.println("Enum Constructor");
	}
}
class Demo{
	public static void main(String args[]){
		System.out.println(Pro.Rushi);
		System.out.println(Pro.Kiran);

		Pro p=Pro.Rushi;
		Pro q=Pro.Rushi;
		System.out.println(p.name());
		System.out.println(p.ordinal());
		System.out.println(p.toString());
		System.out.println(p.equals(q));
		
	}
}
