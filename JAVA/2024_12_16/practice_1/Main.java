package inheritanceprac;

public class Main {
    public static void main(String[] args) {

        Dog poppi = new Dog("poppi", 2,"mix");
        Cat choco = new Cat("choch",2);

        System.out.println(poppi.toString());
        poppi.Animal_cries();

        System.out.println();

        System.out.println(choco.toString());
        choco.Animal_cries();
        choco.Cat_Golgol();
    }
}
