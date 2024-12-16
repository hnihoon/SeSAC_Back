//2.실습2

package inheritanceprac;

public class Bus extends Vehicle{
    private int passenger = 0;

    public Bus(int max_fuel) {
        super(max_fuel);
    }

    public void passengerControll(int passenger){
        this.passenger += passenger;
        System.out.println("passenger = " + this.passenger);
        if(this.passenger < 0){
            System.out.println("File");
            this.passenger = 0;
        }
    }


}
