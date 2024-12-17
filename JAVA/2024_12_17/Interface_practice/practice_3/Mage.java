package test;

public class Mage extends Character {
    int maxMp;
    int mp;

    public Mage() {
        maxMp = 100;
        maxHp = 70;
        mp = maxMp;
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void levelUp() {
        level += 1;
        maxHp += 15;
        hp = maxHp;
        maxMp += 10;
        mp = maxMp;
        System.out.println("레벨 : " + level);
    }

    public void magic(){
        if(mp >= 100){
            System.out.println("마법공격!!");
            mp -= 100;
        } else {
            System.out.println("MP가 부족합니다");
        }
    }

    @Override
    public String toString() {
        return "Mage{" +
                "maxMp=" + maxMp +
                ", mp=" + mp +
                ", level=" + level +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                '}';
    }
}
