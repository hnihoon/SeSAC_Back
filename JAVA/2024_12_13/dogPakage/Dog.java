package dogPakage;

public class Dog{
    String dog_breed = "chihuahua";
    String name = "poppi";

    //1)sit을 출력하기 위한 메서드
    public static void sitdown(){
        System.out.println("sit!");
    }

    //2)hand를 출력하기 위한 메서드
    public static void hand(){
        System.out.println("hand!");
    }

    //3)전체 내용을 출력하기 위한 메서드
    public String toString() {
        return "Dog{" +
                "dog_breed='" + dog_breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
