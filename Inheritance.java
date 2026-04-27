class Accenture {
    public void startEngine() {
        System.out.println("vehicle started");
    }

    public void stopEngine() {
        System.out.println("vehicle is stop");
    }
}

class Car extends Accenture {
    public void startCar() {
        startEngine();
    }

    public void stopCar() {
        stopEngine();
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Car c = new Car();
        c.startCar();
        c.stopCar();
    }
}