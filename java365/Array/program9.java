/*Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true */

public class program9 {
    public static void main(String args[]){
        String w="ABCCED";
        char ch[]=w.toCharArray();

        String str[][]=new String[][]{{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
        int count=0;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[0].length;j++){
                
                for(int k=0;k<ch.length;k++){
                    if(str[i][j].equals(ch[k])){
                        ch[k]='1';
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        if(count==w.length()){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
