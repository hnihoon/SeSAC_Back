//3.실습3

package inheritanceprac;

public class Warrior extends Character{
    int angerGauge = 0;

    public Warrior() {
        super(120);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        setHP(getHP() + 30);
        System.out.println(getHP());
    }

    @Override
    public void attack() {
        System.out.println("warrior Attack!!!");
    }
}
