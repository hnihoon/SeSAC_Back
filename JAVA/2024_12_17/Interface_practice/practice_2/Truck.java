package test;

public class Truck extends Vehicle implements Cargo{
    private int load = 0;

    public Truck() {
        this.max_fuel = 250;
        System.out.println("Truck 최대 연료량 = " + this.max_fuel);
    }

    public void loadCargo(int load){
        this.load += load;
        if (this.load > 0){
            System.out.println("현재 적재물 = " + this.load);
        } else if(this.load < 0){
            System.out.println("잘못된 방식입니다.");
        } else {
            System.out.println("적재물이 없습니다.");
        }
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
