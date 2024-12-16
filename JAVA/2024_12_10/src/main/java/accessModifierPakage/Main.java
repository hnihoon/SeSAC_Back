package accessModifierPakage;

public class Main {
    public static void main(String[] args) {
        PriveteModifier pm = new PriveteModifier();

        System.out.println(pm.publicNum);
//      System.out.println(pm.privateNum); 불러올 수 없음

        pm.publicHi();
//      pm.privateHi(); 불러올 수 없음

        System.out.println(pm.getPrivateNum()); // getter를 활용해 불러올 수 있음
        pm.sayHi();

    }
}
