/* Create a class Employee:

private salary
static companyName
final id
Add getter/setter  */

public class Employee{
     private double salary;
     static String companyName ="google";
     final int id;
     
     Employee(int id){
        this.id=id;
     }
     
     public void setSalary(double salary){
           this.salary=salary;
           
     }
    public int getId(){
        return id;
    }
     public double getSalary(){
         return salary;
     }
     public static String getCompanyName(){
         return companyName;
     }
     
     public static void main(String args[]){
         Employee e=new Employee(10);
         e.setSalary(25000);
         System.out.println("ID :"+e.getId());
         System.out.println("SALARY :" +e.getSalary());
         System.out.println("COMPANY NAME : "+e.getCompanyName());
         
         
     }
}