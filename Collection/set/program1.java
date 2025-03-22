// uerdefine  obj pass to treeset 


import java.util.TreeSet;
class Movie implements Comparable{
    String movieName=null;
    float coll=0.0f;
    Movie(String movieName,float coll){
        this.movieName=movieName;
        this.coll=coll;
    }
    public int compareTo(Object obj){
        // return (int)(coll -(((Movie)obj).coll));     //sort coll 
        return movieName.compareTo(((Movie)obj).movieName);       // sort movieName
    }

    public String toString(){
        return movieName+":"+coll;
    }
}
class program1{
    public static void main(String args[]){
        TreeSet ts=new TreeSet();
        ts.add(new Movie("gadar",10.00f));
        ts.add(new Movie("omg",40.00f));
        ts.add(new Movie("jailer",30.00f));
        ts.add(new Movie("toto",20.00f));

        System.out.println(ts);
    }
}































// import java.util.TreeSet;
// class Myclass implements Comparable{
//     float num=0.0f;
//     Myclass(float num){
//         this.num=num;
//     }
//     public int compareTo(Object obj){
//         return (int)(num-((Myclass)obj).num);
//     }
//     public String toString(){
//         return "num :"+num;
//     }
    
// }
// class program1{
//     public static void main(String args[]){
//         TreeSet ts=new TreeSet();
//         ts.add(new Myclass(90.00f));
//         ts.add(new Myclass(80.00f));
//         ts.add(new Myclass(60.00f));
//         ts.add(new Myclass(70.00f));
//         System.out.println(ts);
//     }
// }