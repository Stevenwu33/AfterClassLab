import Interface.Vehicle;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Start");
    }

    @Override
    public void stop() {
        System.out.println("Car Stop");

    }
}
