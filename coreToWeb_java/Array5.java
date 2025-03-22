import java.io.*;

// wap to take a 7 charactor form user also take integer element  print vowels foem the array
public class Array5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array:");
        int size=Integer.parseInt(br.readLine());

        char arr[]=new char[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=(char)br.read();
            br.skip(1);
        }
        System.out.println("vowels of the arry is=");
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
                System.out.println(arr[i]);
            }
        }
    }
}
