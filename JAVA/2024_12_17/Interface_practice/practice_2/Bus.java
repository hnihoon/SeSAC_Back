package test;

public class Bus extends Vehicle implements Boarding{
    private int passenger = 0;

    public Bus() {
        this.max_fuel = 300;
        System.out.println("Bus 최대 연료량 = " + this.max_fuel);
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

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
}
