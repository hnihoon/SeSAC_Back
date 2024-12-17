package test;

public class Main {
    public static void main(String[] args) {

        Animal poppi = new Dog("뽀삐",2, "믹스");
        Cat choco = new Cat("초코",2);

        System.out.println(poppi.toString());
        poppi.makeSound();

        System.out.println();

        System.out.println(choco.toString());
        choco.makeSound();
        choco.grr();

        System.out.println();

        makeThemSound(poppi);

        System.out.println();

        makeThemSound(choco);
    }
        public static void makeThemSound(Animal animal) {
            System.out.println("cry!");
            animal.makeSound();
        }
}
