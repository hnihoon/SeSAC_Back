//1.이름 나이를 가지고있는 Person class를 구현해보기

package day241212_class;

public class class_person {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.toString());
    }
}

class Person{
    String name = "kim";
    int age = 32;

    //1)전체 내용을 출력하기 위한 메서드
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
