package test;

public class GenericsMain {

    public static void main(String[] args) {
        // 1. String으로 지정
        Generics<String> test1 = new Generics<String>();
        test1.setValue("Hello!");
        System.out.println(test1.getValue());

        // 2. Integer로 지정
        Generics<Integer> test2 = new Generics<>(); // 생성자 부분의 타입 매개변수는 생략 가능
        test2.setValue(120);
        System.out.println(test2.getValue());
    }
}
