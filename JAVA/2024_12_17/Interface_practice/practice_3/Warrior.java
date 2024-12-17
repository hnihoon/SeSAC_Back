package test;

public class Warrior extends Character{
    private int angerGauge;

    public Warrior() {
        maxHp = 120;
    }

    @Override
    public void attack() {
        if (angerGauge == 100){
            powerAttack();
        } else {
            super.attack();
            angerGauge += 10;
        }
    }

    @Override
    public void levelUp() {
        level += 1;
        maxHp += 30;
        hp = maxHp;
        System.out.println("레벨 : " + level);
    }

    public void angerGaugeMax(){
        angerGauge = 100;
    }

    public void powerAttack(){
        System.out.println("강한공격!!");
        angerGauge -= 100;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "angerGauge=" + angerGauge +
                ", level=" + level +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                '}';
    }
}
