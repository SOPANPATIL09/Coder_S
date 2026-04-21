class Vehicle {
    Vehicle() {
        System.out.println("Welcome to Vehicle class");
    }
}

class Toyota extends Vehicle {   
    Toyota() {
        super();
    }
}

public class TestVehicle {
    public static void main(String args[]) {
        Vehicle t = new Toyota();
    }
}