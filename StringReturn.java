/*🔹 Q1

Override toString() to print:

Name: Ram, Age: 25 */
public class StringReturn{
      int age =25;
      String name= "Ram";
      
      public String toString(){
          return "Name:"+ name +",  "+"Age:" +age;
      }
      
      public static void main(String args[]){
          StringReturn sr=new StringReturn();
         System.out.println(sr);
      }
}
