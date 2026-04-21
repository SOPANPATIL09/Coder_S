  /* 🔹 Q1

Create class Student

Fields: id, name
Clone object and print both */

public class StudentClone implements Cloneable{
      int id;
      String name;
     StudentClone(int id, String name){
         this.id=id;
         this.name=name;
     }
  public Object clone()throws CloneNotSupportedException {
        return super.clone();
      
  }    
    
    public static void main(String args[]) throws CloneNotSupportedException{
        
        StudentClone s=new StudentClone(1,"sopan");
        
        StudentClone k=(StudentClone) s.clone();
        
       System.out.println("Same object? " + (s == k));
        System.out.println("Original: " + s.id + " " + s.name);
        System.out.println("Cloned: " + k.id + " " + k.name);
        
    }
      
      
}