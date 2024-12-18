package test;

public class Character implements Attack{
    private String name;
    private int level;
    private int hp;
    private int mp;
    private int power;
    private boolean weaponWhether = false;
    Weapon weapon;


    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 50;
        this.mp = 50;
        this.power = 10;
    }

    public void levelUp(){
        level += 1;
        hp = hp + (level * 15);
        mp = mp + (level * 10);
        power += 2;
    }

    public void weaponON(Weapon weapon){
        if(!weaponWhether){
            System.out.println("무기장착");
            this.weapon = weapon;
            this.power += weapon.getAttackPower();
            weaponWhether = true;
        } else {
            System.out.println("무기장착해제");
            this.weapon = null;
            weaponWhether = false;
        }
    }

    @Override
    public void normalAttack() {
        if (weaponWhether){
            weapon.normalAttack();
        } else {
            System.out.println("일반공격!");
        }
    }

    @Override
    public void specialAttack() {
        if (weaponWhether){
            weapon.specialAttack();
        } else {
            System.out.println("사용불가..");
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                ", mp=" + mp +
                ", power=" + power +
                '}';
    }
}
