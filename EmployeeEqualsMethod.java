
/*Q2
Create class Employee
Compare two employees using equals()*/
public class EmployeeEqualsMethod{
    
    int id;
             
     EmployeeEqualsMethod(int id){
         this.id=id;
     }
     public boolean equals(Object obj){
        
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;
         EmployeeEqualsMethod s=(EmployeeEqualsMethod) obj;
         return this.id==s.id;
         
      }

    public static void main(String args[]){
        EmployeeEqualsMethod e=new EmployeeEqualsMethod(1);
        EmployeeEqualsMethod k=new EmployeeEqualsMethod (1);
        
        System.out.println(e.equals(k));
        
    }
    
}