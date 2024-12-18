package test;

public class Gun extends Weapon{
    int range;

    public Gun(int attackPower, int stamina, int range) {
        setAttackPower(attackPower);
        setStamina(stamina);
        setWeaponDivision("Gun");
        this.range = range;
    }

    @Override
    public void normalAttack() {
        System.out.println("Gun 일반공격!");
        setStamina(getStamina() - 1);
    }

    @Override
    public void specialAttack() {
        System.out.println("Gun 특수공격!");
        setStamina(getStamina() - 3);
    }
}
