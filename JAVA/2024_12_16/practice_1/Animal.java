//1. 실습1

package inheritanceprac;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void Animal_cries(){
        System.out.println("animal_cries");
    }

}
