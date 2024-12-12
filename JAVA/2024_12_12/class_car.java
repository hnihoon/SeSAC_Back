//4.car calss를 구현하고 다양한 기능 만들기

package day241212_class;

public class class_car {
    public static void main(String[] args) {
        Car avante = new Car("Avante",20);
        avante.speedUp(avante.speed);
        avante.speedUp(avante.speed);
        avante.speedUp(avante.speed);
        avante.speedDown(avante.speed);

        System.out.println(avante.toString());

    }
}

class Car{
    String model = "";
    int speed = 0;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    //1)속도 증가 : 10씩 증가
    public void speedUp(int speed){
        this.speed = speed + 10;
    }

    //2)속도 감소 : 10씩 감소
    public void speedDown(int speed){
        this.speed = speed - 10;
    }

    //현재 모델명과 스피드 조회
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }


}
