//given root contain 4 direction (E,W,S,N) fin shortest path to reach destination
// WNEENESENNN
public class program15 {
    public static void main(String args[]){

        String str="WNEENESENNN";
        int y=0;
        int x=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x=x-1;
            }else if(str.charAt(i)=='E'){
                x=x+1;
            }else if(str.charAt(i)=='N'){
                y=y+1;
            }else if(str.charAt(i)=='S'){
                y=y-1;
            }else{
                System.out.println("not");
            }
        }
        int x2=(x*x);
        int y2=(y*y);

        float shortpath=(float)Math.sqrt(x2+y2);
        System.out.println(shortpath);

    }
}
