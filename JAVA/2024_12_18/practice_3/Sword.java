package test;

public class Sword extends Weapon{
    int range;

    public Sword(int attackPower, int stamina, int range) {
        setAttackPower(attackPower);
        setStamina(stamina);
        setWeaponDivision("Sword");
        this.range = range;
    }

    @Override
    public void normalAttack() {
        System.out.println("Sword 일반공격!");
        setStamina(getStamina() - 2);
    }

    @Override
    public void specialAttack() {
        System.out.println("Sword 특수공격!");
        setStamina(getStamina() - 4);
    }
}
