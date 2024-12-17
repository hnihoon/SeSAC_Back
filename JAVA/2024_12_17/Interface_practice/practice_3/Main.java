package test;

public class Main {
    public static void main(String[] args) {

        Character character = new Character();

        System.out.println(character.toString());
        character.levelUp();
        character.attack();
        System.out.println(character.toString());

        System.out.println();

        Warrior warrior = new Warrior();
        System.out.println(warrior.toString());
        warrior.attack();
        warrior.levelUp();
        System.out.println(warrior.toString());
        warrior.angerGaugeMax();
        warrior.attack();
        System.out.println(warrior.toString());

        System.out.println();

        Mage mage = new Mage();

        System.out.println(mage.toString());
        mage.attack();
        mage.levelUp();
        System.out.println(mage.toString());
        mage.magic();
        System.out.println(mage.toString());



    }
}
