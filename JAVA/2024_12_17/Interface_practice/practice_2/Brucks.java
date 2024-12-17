package test;

public class Brucks extends Vehicle implements Boarding, Cargo{
    private int passenger = 0;
    private int load = 0;

    public Brucks() {
        max_fuel = 1000;
        System.out.println("Brucks 최대 연료량 = " + max_fuel);
    }

    public void passengerBoarding(int passenger){
        this.passenger += passenger;
        if (this.passenger > 0){
            System.out.println("현재 탑승객 = " + this.passenger);
        } else if(this.passenger < 0){
            System.out.println("잘못된 방식입니다.");
        } else {
            System.out.println("탑승객이 없습니다.");
        }
    }

    public void loadCargo(int load){
        this.load += load;
        if (this.load > 0){
            System.out.println("현재 적재물 = " + this.load);
        } else if(this.load < 0){
            System.out.println("잘못된 방식입니다.");
        } else {
            System.out.println("탑승객이 없습니다.");
        }
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
