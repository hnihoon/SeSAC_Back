//2.견종, 이름을 가지고, “앉아”, “손”을 할 수 있는 Dog 클래스를 구현하시오.

package day241212_class;

public class class_dog {
    public static void main(String[] args) {
        Dog poppi = new Dog();

        System.out.println(poppi.toString());
        poppi.sitdown();
        poppi.hand();
    }
}

class Dog{
    String dog_breed = "chihuahua";
    String name = "poppi";

    //1)sit을 출력하기 위한 메서드
    public void sitdown(){
        System.out.println("sit!");
    }

    //2)hand를 출력하기 위한 메서드
    public void hand(){
        System.out.println("hand!");
    }

    //3)전체 내용을 출력하기 위한 메서드
    @Override
    public String toString() {
        return "Dog{" +
                "dog_breed='" + dog_breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
