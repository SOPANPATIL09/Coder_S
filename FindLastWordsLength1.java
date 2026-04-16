public class FindLastWordsLength1 {
    public int lengthOfLastWords(String str){
        
        String ch[] =str.split(" ");
        
         
         return ch[ch.length-1].length();  
    }
    
    public static void main(String args[]){
        FindLastWordsLength1 m=new FindLastWordsLength1();
        String s="hi my name is sopan";
        System.out.println(m.lengthOfLastWords(s));
    }
}