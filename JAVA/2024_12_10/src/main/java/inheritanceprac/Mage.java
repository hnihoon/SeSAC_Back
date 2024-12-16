//3.실습3

package inheritanceprac;

public class Mage extends Character{
    private int mana = 0;

    public Mage() {
        super(70);
        this.mana = 100;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        setHP(getHP() + 15);
        System.out.println(getHP());
    }

    @Override
    public void attack() {
        System.out.println("mage Attack!!!");
    }
}
