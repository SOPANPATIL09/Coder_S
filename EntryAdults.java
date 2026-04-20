public class EntryAdults{
    public static void m1(int age){
        
        if(age>18){
            System.out.println("welcome you are adults");
        }
        else{
            throw new ArithmeticException("your are minor you not allow to enter");
        }
        
    }
    public static void main(String args[]){
        
        EntryAdults.m1(12);
    }
}