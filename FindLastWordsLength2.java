class FindLastWordsLength2 {
    public int lengthOfLastWord(String s) {
          
          s = s.trim();
           int count=0;
          for(int i=s.length()-1; i>=0; i--){

             

            if(s.charAt(i)==' '){
                break;
            }
              count++;
          }
          return count;
        
    }
    public static void main(String args[]){
        FindLastWordsLength2 m=new FindLastWordsLength2();
        String s="hi my name is sopan";
        System.out.println(m.lengthOfLastWord(s));
    }
}