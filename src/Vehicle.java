class Vehicle {
    public void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started.");
    }
}