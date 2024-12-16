//1.실습1

package inheritanceprac;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void Animal_cries() {
        System.out.println("Meow");
    }

    public void Cat_Golgol(){
        System.out.println("golgol");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
