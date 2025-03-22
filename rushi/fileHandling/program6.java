// serializable & Deserializable

import java.io.*;
class Player implements Serializable{
	String name=null;
	int jrno=0;
	Player(String name,int jrno){
		this.name=name;
		this.jrno=jrno;
	}
	
}
class Sdemo{
	public static void main(String args[])throws IOException,ClassNotFoundException{
		// srializable
		FileWriter fw=new FileWriter("Player.txt");
		Player obj1=new Player("MSD",7);
		Player obj2=new Player("Virat",18);
		
		FileOutputStream fos=new FileOutputStream("Player.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(obj1);
		oos.writeObject(obj2);

		oos.close();
		fos.close();


		// DeserialIzable

		FileInputStream fis=new FileInputStream("Player.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);

		Player obj3=(Player)ois.readObject();
		Player obj4=(Player)ois.readObject();
	//	Player obj5=(Player)ois.readObject();
			
		ois.close();
		ois.close();

		System.out.println("jrno :"+obj3.jrno);
		System.out.println("name :"+obj3.name);

		System.out.println("Jrno :"+obj4.jrno);
		System.out.println("name :"+obj4.name);
	}
}
