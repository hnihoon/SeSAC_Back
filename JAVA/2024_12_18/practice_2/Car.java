package test;

public class Car {
    private String modelName;
    private Engine engine;

    public Car(String modelName, Engine engine) {
        this.modelName = modelName;
        this.engine = engine;
    }

    public void printModelName(){
        System.out.println("모델명 : " + modelName);
    }

    public void speed(int speed){
        System.out.println("속도 : " + engine.getHorsePower() * speed);
    }

}
