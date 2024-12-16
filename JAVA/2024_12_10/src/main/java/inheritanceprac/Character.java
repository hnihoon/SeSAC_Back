//3.실습3

package inheritanceprac;

public class Character {
    private String name = "";
    private int level = 1;
    private int HP = 50;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public Character() {
    }

    public Character(int HP) {
        this.HP = HP;
    }

    public void attack(){
        System.out.println("attack!!");
    }

    public void levelUp(){
        level += 1;
        System.out.println("level = " + level);
    }
}
