//last to first

public class LastToFirst{
    public static void main(String args[]){
        
        
        String str ="India";
        String s2 ="";
         s2+=str.charAt(str.length()-1);
        for(int i=0; i<str.length()-1; i++){
            s2+=str.charAt(i);
        }
        System.out.println(s2);
        
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(str.length()-1));
        
        sb.append(str.substring(0,str.length()-1));
        
        System.out.println(sb.toString());
        
       
    }
}