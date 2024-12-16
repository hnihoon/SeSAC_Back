//1.실습1

package inheritanceprac;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void Animal_cries() {
        System.out.println("bowwow");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
