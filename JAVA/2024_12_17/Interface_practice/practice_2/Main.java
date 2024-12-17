package test;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        System.out.println(vehicle.max_fuel);
        vehicle.speedCheck();
        vehicle.speedUp();
        vehicle.speedDown();
        vehicle.speedDown();

        System.out.println();

        Bus bus = new Bus();

        bus.passengerBoarding(2);
        bus.passengerBoarding(-2);
        bus.passengerBoarding(-4);

        System.out.println();

        Truck truck = new Truck();

        truck.loadCargo(2);
        truck.loadCargo(-2);
        truck.loadCargo(-4);

        System.out.println();

        Brucks brucks = new Brucks();

        brucks.passengerBoarding(2);
        brucks.passengerBoarding(-2);
        brucks.passengerBoarding(-4);

        System.out.println();

        brucks.loadCargo(2);
        brucks.loadCargo(-2);
        brucks.loadCargo(-4);

    }
}
