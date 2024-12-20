package test;

public class GenericsMethodMain {
    public static void main(String[] args) {
        GenericsMethod<Integer> genMethod = new GenericsMethod<>(100);

        // Integer가 아닌 String 타입의 인자를 넣었지만 컴파일 에러가 발생하지 않는다.
        // 제네릭 메서드의 타입 변수는 클래스의 타입 변수와는 별도이기 때문이다.
        genMethod.show("hello", "world");
    }
}
