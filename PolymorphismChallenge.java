package Bhandari;

public class PolymorphismChallenge {
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "VBM 4wheelDrive");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(4, "Ford 4xSeat");
        System.out.println(car);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }

}


class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return ("Car --> StartEngine");
    }

    public String accelerate() {
        return ("Car --> Accelerate");
    }

    public String brake() {
        return ("Car -->  Break");
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinder, String name) {
        super(8, "Krishna");

    }

    @Override
    public String startEngine() {
        return ("Mitsubishi --> StartEngine");
    }

    @Override
    public String accelerate() {
        return ("Mitsubishi --> accelerate");
    }

    @Override
    public String brake() {
        return ("Mitsubishi --> brake");
    }
}



