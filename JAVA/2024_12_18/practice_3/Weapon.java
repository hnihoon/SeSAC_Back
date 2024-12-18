package test;

public abstract class Weapon implements Attack {
    private int attackPower;
    private int stamina;
    private String weaponDivision;

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getWeaponDivision() {
        return weaponDivision;
    }

    public void setWeaponDivision(String weaponDivision) {
        this.weaponDivision = weaponDivision;
    }
}
