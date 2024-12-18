package test;

public class Main {
    public static void main(String[] args) {

        Character character_1 = new Character("캐릭터1");

        System.out.println(character_1.toString());
        character_1.levelUp();
        System.out.println(character_1.toString());
        character_1.normalAttack();
        character_1.specialAttack();

        System.out.println();

        Character character_gun = new Character("총캐릭터");
        Character character_sword = new Character("검캐릭터");

        Gun gun_1 = new Gun(50,20,600);
        Sword sword_1 = new Sword(20,50,200);

        character_gun.weaponON(gun_1);
        character_gun.normalAttack();
        character_gun.specialAttack();
        System.out.println(character_gun.toString());

        System.out.println();

        character_sword.weaponON(sword_1);
        character_sword.normalAttack();
        character_sword.specialAttack();
        System.out.println(character_sword.toString());

    }
}
