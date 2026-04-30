public class Inteface1{
    public static void main(String args[]){
    Vehicle c=new Bike();
     c.brake();
}}
interface Vehicle{
    void brake();
    
}
class Car implements Vehicle{
    
    public void brake(){
        System.out.println("please stop the car");
    }
    
}

class Bike implements Vehicle
{
    public void brake(){
        System.out.println("stop the bike");
    }
}