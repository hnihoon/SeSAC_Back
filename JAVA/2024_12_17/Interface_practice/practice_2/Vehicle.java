package test;

public class Vehicle {
    protected int speed = 0;
    protected int max_fuel = 100;

    public void speedCheck(){
        System.out.println(speed);
    }

    public void speedUp(){
        if (speed >= 100){
            speed = 100;
            System.out.println("현재 최고 속력입니다.");
        } else {
            speed += 20;
            System.out.println("현재 속도 = " + speed);
        }
    }

    public void speedDown(){
        if(speed <= 0) {
            speed = 0;
            System.out.println("꺼짐");
        } else {
            speed -= 20;
            System.out.println("현재 속도 = " + speed);
        }
    }
}
