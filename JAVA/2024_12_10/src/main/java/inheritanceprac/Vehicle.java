//2.실습2

package inheritanceprac;

public class Vehicle {
    private int speed;
    private int max_fuel = 0;

    public Vehicle(int max_fuel) {
        this.max_fuel = max_fuel;
    }

    public void maxFuel(){
        System.out.println("Max_Speed = " + this.max_fuel);
    }

    public void speedControll(int speed){
        if(this.speed < 200){
            this.speed = speed;
            System.out.println("speed = " + this.speed);
        } else {
            System.out.println("max_fuel!!!!");
        }
    }
    public void Fuel_controll(){}
}
