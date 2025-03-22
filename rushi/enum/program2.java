// Switch case in 
import java.util.*;
enum Lineup{
	Rohit,
	Virat,
	MSD,
	KLRahul;

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();

		Lineup player=Lineup.name;
		
		switch(player){
			case Rohit:
				System.out.println("Sharma");
				break;

			case Virat:
				System.out.println("Kholi");
				break;
			case MSD:
				System.out.println("7");
				break;
			case KLRahul:
				System.out.println("Anna");
				break;

			default :
				System.out.println("NOT");
		}
	}
}
