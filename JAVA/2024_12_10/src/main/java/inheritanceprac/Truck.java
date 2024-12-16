//2.실습2

package inheritanceprac;

public class Truck extends Vehicle{
    private int freight = 0;

    public Truck(int max_fuel) {
        super(max_fuel);
    }

    public void freightControll(int freight){
        this.freight += freight;
        System.out.println("freight = " + this.freight);
        if(this.freight < 0){
            System.out.println("File");
            this.freight = 0;
        }
    }
}
