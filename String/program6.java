public class program6 {
    public static void main(String args[]){

        String str1="Rushi";
        String str2="Ghegade";

        System.out.println(str1);
        System.out.println(str2);

        str1.concat(str2);   // make object on heap section there is no reffereance after some time garbeage collector remove 

        System.out.println(str1);
        System.out.println(str2);

        
    }
}
