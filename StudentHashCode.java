/* Q3

Override hashCode() and print it */
public class StudentHashCode{
    int id;
    StudentHashCode(int id){
        this.id=id;
    }
    
    public int hashCode(){
        return id;
    }
    
    public static void main(String args[]){
        StudentHashCode s=new StudentHashCode(2);
        System.out.println(s.hashCode());
        
    }
    
}
