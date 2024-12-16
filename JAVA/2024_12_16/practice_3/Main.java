package inheritanceprac;

public class Main {
    public static void main(String[] args) {

        Character character = new Character();
        System.out.println(character.getLevel());
        character.attack();
        character.levelUp();
        System.out.println();

        Warrior warrior = new Warrior();
        System.out.println(warrior.getHP());
        warrior.levelUp();
        warrior.attack();
        System.out.println();

        Mage mage = new Mage();
        System.out.println(mage.getMana());
        System.out.println(mage.getHP());
        mage.levelUp();
        mage.attack();
    }
}
