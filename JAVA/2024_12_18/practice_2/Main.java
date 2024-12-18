package test;

public class Main {
    public static void main(String[] args) {

        Engine engine_2 = new Engine(2);
        Car car_1 = new Car("Car1",engine_2);

        car_1.printModelName();
        car_1.speed(20);

        System.out.println();

        Engine engine_4 = new Engine(4);
        Car car_2 = new Car("Car2",engine_4);

        car_2.printModelName();
        car_2.speed(20);
    }
}
