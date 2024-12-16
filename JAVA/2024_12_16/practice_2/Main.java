package inheritanceprac;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(100);
        vehicle.maxFuel();
        vehicle.speedControll(20);
        System.out.println();

        Bus bus = new Bus(300);
        bus.maxFuel();
        bus.passengerControll(2);
        System.out.println();

        Truck truck = new Truck(250);
        truck.maxFuel();
        truck.freightControll(2);
    }
}
