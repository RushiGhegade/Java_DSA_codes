//  String method

public class program8 {
    public static void main(String args[]){

        String str1="Rushi";
        String str2="Gheagde";

    //  1) Concat(String str); method 
        String str3=str1.concat(str2);         
        System.out.println(str3);

    //  2) length();
        System.out.println(str3.length());    

    //  3) charAt(index);
        System.out.println(str3.charAt(0));
        // System.out.println(str3.charAt(17));    // String indexOutOfBound Exception
      
    //  4) compareTo(String str2);      // case sensetive
        String str4="Rushi";
        System.out.println(str1.compareTo(str4));    // same return 0
        System.out.println(str1.compareTo(str2));   //  String completily different then 1st latter difference 
     
    //  5) compareToIgnoreCase(string str);  // not case sensetive
        String str5="SHASHI";         
        String str6="shashi";
        System.out.println(str5.compareToIgnoreCase(str6));

    //  6) equals(String str);      containt same then return true
        System.out.println(str1.equals(str4));    
        System.out.println(str1.equals(str2));

    //  7) toCharArray(); convert sting into Char array 
        char arr[]=str1.toCharArray();
        System.out.println(arr[0]);

    //  8) indexOf(int ch,int fromIndex);  ch =found latter : fromindex -> find latter from this index
        System.out.println(str5.indexOf('H',0));    // 1
        System.out.println(str5.indexOf('H',2));    // 4
        System.out.println(str5.indexOf('I',9));    // -1 not found

    //  9) lastIndexOf(char ch,int fromindex) : find ch latter go back from this index
        System.out.println(str5.lastIndexOf('H',0));    // 1
        System.out.println(str5.lastIndexOf('H',2));    // 4
        System.out.println(str5.lastIndexOf('I',9));    // -1 not found

    //  10) replace(char oldchar ,char newchar);
        System.out.println(str5.replace('S','A')); // all s replace by a
        System.out.println(str5);

    //  11) subString(int index,int index);
        System.out.println(str5.substring(4));         // index (4 to end)
        System.out.println(str5.substring(0,4));
        
    }
}
