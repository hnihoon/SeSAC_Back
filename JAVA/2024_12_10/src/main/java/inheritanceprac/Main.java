package inheritanceprac;

public class Main {
    public static void main(String[] args) {

        Dog poppi = new Dog("poppi", 2,"mix");
        Cat choco = new Cat("choch",2);

        System.out.println(poppi.toString());
        poppi.Animal_cries();

        System.out.println();

        System.out.println(choco.toString());
        choco.Animal_cries();
        choco.Cat_Golgol();

        System.out.println();
        System.out.println("==================================================");
        System.out.println();

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

        System.out.println();
        System.out.println("==================================================");
        System.out.println();

        Character character = new Character();
        System.out.println(character.getLevel());
        character.attack();
        character.levelUp();
        System.out.println();

        Warrior warrior = new Warrior();
        System.out.println(warrior.getHP());
        warrior.levelUp();
        warrior.attack();
        System.out.println();

        Mage mage = new Mage();
        System.out.println(mage.getMana());
        System.out.println(mage.getHP());
        mage.levelUp();
        mage.attack();

    }
}
