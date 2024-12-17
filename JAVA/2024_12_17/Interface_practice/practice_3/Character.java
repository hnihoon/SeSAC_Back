package test;

public class Character {
    protected int level = 1;
    protected int hp;
    protected int maxHp;

    public Character() {
        maxHp = 50;
    }

    public void attack(){
        System.out.println("기본공격!!");
    }

    public void levelUp(){
        level += 1;
        maxHp += 10;
        hp = maxHp;
        System.out.println("레벨 : " + level);
        System.out.println("최대체력 : " + hp);
    }

    @Override
    public String toString() {
        return "Character{" +
                "level=" + level +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                '}';
    }
}
