package test;

public class GenericsMethod<T> {
        private T value;

         GenericsMethod(T value) {
            this.value = value;
        }

        // 이름이 T로 동일하지만, Test 클래스의 제네릭 T와는 엄연히 다른 독립적인 제네릭에 해당
        public <T> void show(T object1, T object2) {
            System.out.println(object1);
            System.out.println(object2);
        }
}
