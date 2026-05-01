public class FirstToLast{
    public static void main(String args[]){
          
                 String str="India";
                  String s1="";
                  
                  for(int i=1; i<str.length(); i++){
                      s1 +=str.charAt(i);
                  }
                  s1 +=str.charAt(0);
                  
                  System.out.println(s1);
                  
                  StringBuilder sb =new StringBuilder();
                   sb.append(str.substring(1));
                   sb.append(str.charAt(0));
                   
                   System.out.println(sb.toString());
                  
                  
          
    }
}