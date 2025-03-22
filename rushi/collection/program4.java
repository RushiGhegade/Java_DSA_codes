
import java.util.*;
class Movie implements Comparable{
	String mname=null;
	int totcoll= 0;
	Movie(String mname,int totcoll){
		this.mname=mname;
		this.totcoll=totcoll;
	}
	public String toString(){
		return mname+":"+totcoll;	
	}
	public int compareTo(Object obj){
		return mname.compareTo(((Movie)obj).mname);
	}
	
}
class sort{
	public static void main(String args[]){
		ArrayList<Movie> al=new ArrayList<Movie>();
		al.add(new Movie("ved",100000));
		al.add(new Movie("sairat",500000));
		al.add(new Movie("omg",300000));
		al.add(new Movie("gajani",1000000));

		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);
	}
}














